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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VPRExplainDimensionItem extends AbstractModel {

    /**
    * <p>标签</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>标签名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>标签描述</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get <p>标签</p> 
     * @return Key <p>标签</p>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>标签</p>
     * @param Key <p>标签</p>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>标签名称</p> 
     * @return Name <p>标签名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>标签名称</p>
     * @param Name <p>标签名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>标签描述</p> 
     * @return Remark <p>标签描述</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>标签描述</p>
     * @param Remark <p>标签描述</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public VPRExplainDimensionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VPRExplainDimensionItem(VPRExplainDimensionItem source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

