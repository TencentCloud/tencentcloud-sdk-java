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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteMaterialRequest extends AbstractModel{

    /**
    * 平台名称，指定访问的平台。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 媒体 Id。
    */
    @SerializedName("MaterialId")
    @Expose
    private String MaterialId;

    /**
    * 操作者。填写用户的 Id，用于标识调用者及校验媒体删除权限。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get 平台名称，指定访问的平台。 
     * @return Platform 平台名称，指定访问的平台。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台名称，指定访问的平台。
     * @param Platform 平台名称，指定访问的平台。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 媒体 Id。 
     * @return MaterialId 媒体 Id。
     */
    public String getMaterialId() {
        return this.MaterialId;
    }

    /**
     * Set 媒体 Id。
     * @param MaterialId 媒体 Id。
     */
    public void setMaterialId(String MaterialId) {
        this.MaterialId = MaterialId;
    }

    /**
     * Get 操作者。填写用户的 Id，用于标识调用者及校验媒体删除权限。 
     * @return Operator 操作者。填写用户的 Id，用于标识调用者及校验媒体删除权限。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者。填写用户的 Id，用于标识调用者及校验媒体删除权限。
     * @param Operator 操作者。填写用户的 Id，用于标识调用者及校验媒体删除权限。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public DeleteMaterialRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteMaterialRequest(DeleteMaterialRequest source) {
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.MaterialId != null) {
            this.MaterialId = new String(source.MaterialId);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "MaterialId", this.MaterialId);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

