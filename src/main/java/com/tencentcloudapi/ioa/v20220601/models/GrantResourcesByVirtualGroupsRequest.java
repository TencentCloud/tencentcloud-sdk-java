/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GrantResourcesByVirtualGroupsRequest extends AbstractModel {

    /**
    *  
    */
    @SerializedName("Operations")
    @Expose
    private GrantResourceOperationByVirtualGroups [] Operations;

    /**
     * Get   
     * @return Operations  
     */
    public GrantResourceOperationByVirtualGroups [] getOperations() {
        return this.Operations;
    }

    /**
     * Set  
     * @param Operations  
     */
    public void setOperations(GrantResourceOperationByVirtualGroups [] Operations) {
        this.Operations = Operations;
    }

    public GrantResourcesByVirtualGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GrantResourcesByVirtualGroupsRequest(GrantResourcesByVirtualGroupsRequest source) {
        if (source.Operations != null) {
            this.Operations = new GrantResourceOperationByVirtualGroups[source.Operations.length];
            for (int i = 0; i < source.Operations.length; i++) {
                this.Operations[i] = new GrantResourceOperationByVirtualGroups(source.Operations[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Operations.", this.Operations);

    }
}

