import requests
import json
import pytest

BASE_URL = "http://localhost:3000"

def test_create_sim_swap():
    # Step 1: Define payload
    payload = {
        "userId": 1,
        "oldIccid": "8923400000000000001",
        "status": "submitted",
        "timestamp": "2025-04-05T10:00:00Z"
    }

    # Step 2: Send POST request
    response = requests.post(
        f"{BASE_URL}/sim_swaps",
        json=payload  # 'json' param auto-sets Content-Type to application/json
    )

    # Step 3: Assert success
    assert response.status_code == 201, f"Expected 201, got {response.status_code}"
    
    # Step 4: Parse response
    created_data = response.json()
    print("Created SIM Swap:", json.dumps(created_data, indent=2))
    
    # Step 5: Verify ID was assigned
    assert "id" in created_data, "ID was not returned"
    assert created_data["id"] > 0

def test_get_all_sim_swaps():
    response = requests.get(f"{BASE_URL}/sim_swaps")
    assert response.status_code == 200
    print("All SIM Swaps:", response.json())