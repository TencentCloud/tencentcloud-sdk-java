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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BalanceRoGroupLoadRequest extends AbstractModel {

    /**
    * RO 组的 ID，格式如：cdbrg-c1nl9rpv。可通过 [DescribeRoGroups](https://cloud.tencent.com/document/api/236/40939) 获取。
    */
    @SerializedName("RoGroupId")
    @Expose
    private String RoGroupId;

    /**
     * Get RO 组的 ID，格式如：cdbrg-c1nl9rpv。可通过 [DescribeRoGroups](https://cloud.tencent.com/document/api/236/40939) 获取。 
     * @return RoGroupId RO 组的 ID，格式如：cdbrg-c1nl9rpv。可通过 [DescribeRoGroups](https://cloud.tencent.com/document/api/236/40939) 获取。
     */
    public String getRoGroupId() {
        return this.RoGroupId;
    }

    /**
     * Set RO 组的 ID，格式如：cdbrg-c1nl9rpv。可通过 [DescribeRoGroups](https://cloud.tencent.com/document/api/236/40939) 获取。
     * @param RoGroupId RO 组的 ID，格式如：cdbrg-c1nl9rpv。可通过 [DescribeRoGroups](https://cloud.tencent.com/document/api/236/40939) 获取。
     */
    public void setRoGroupId(String RoGroupId) {
        this.RoGroupId = RoGroupId;
    }

    public BalanceRoGroupLoadRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BalanceRoGroupLoadRequest(BalanceRoGroupLoadRequest source) {
        if (source.RoGroupId != null) {
            this.RoGroupId = new String(source.RoGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoGroupId", this.RoGroupId);

    }
}

