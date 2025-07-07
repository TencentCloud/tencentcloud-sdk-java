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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssociateCustomizedConfigRequest extends AbstractModel {

    /**
    * 配置ID
    */
    @SerializedName("UconfigId")
    @Expose
    private String UconfigId;

    /**
    * 关联的server或location
    */
    @SerializedName("BindList")
    @Expose
    private BindItem [] BindList;

    /**
     * Get 配置ID 
     * @return UconfigId 配置ID
     */
    public String getUconfigId() {
        return this.UconfigId;
    }

    /**
     * Set 配置ID
     * @param UconfigId 配置ID
     */
    public void setUconfigId(String UconfigId) {
        this.UconfigId = UconfigId;
    }

    /**
     * Get 关联的server或location 
     * @return BindList 关联的server或location
     */
    public BindItem [] getBindList() {
        return this.BindList;
    }

    /**
     * Set 关联的server或location
     * @param BindList 关联的server或location
     */
    public void setBindList(BindItem [] BindList) {
        this.BindList = BindList;
    }

    public AssociateCustomizedConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssociateCustomizedConfigRequest(AssociateCustomizedConfigRequest source) {
        if (source.UconfigId != null) {
            this.UconfigId = new String(source.UconfigId);
        }
        if (source.BindList != null) {
            this.BindList = new BindItem[source.BindList.length];
            for (int i = 0; i < source.BindList.length; i++) {
                this.BindList[i] = new BindItem(source.BindList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UconfigId", this.UconfigId);
        this.setParamArrayObj(map, prefix + "BindList.", this.BindList);

    }
}

