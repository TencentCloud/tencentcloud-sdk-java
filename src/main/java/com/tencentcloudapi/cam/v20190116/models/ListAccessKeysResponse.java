/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAccessKeysResponse extends AbstractModel{

    /**
    * 访问密钥列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessKeys")
    @Expose
    private AccessKey [] AccessKeys;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 访问密钥列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessKeys 访问密钥列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AccessKey [] getAccessKeys() {
        return this.AccessKeys;
    }

    /**
     * Set 访问密钥列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessKeys 访问密钥列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessKeys(AccessKey [] AccessKeys) {
        this.AccessKeys = AccessKeys;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ListAccessKeysResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAccessKeysResponse(ListAccessKeysResponse source) {
        if (source.AccessKeys != null) {
            this.AccessKeys = new AccessKey[source.AccessKeys.length];
            for (int i = 0; i < source.AccessKeys.length; i++) {
                this.AccessKeys[i] = new AccessKey(source.AccessKeys[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AccessKeys.", this.AccessKeys);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

