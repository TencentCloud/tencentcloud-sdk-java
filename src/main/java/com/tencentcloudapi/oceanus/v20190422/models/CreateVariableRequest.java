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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVariableRequest extends AbstractModel {

    /**
    * 变量名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 变量值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 变量类型  1：显式   2：隐藏
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 描述信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 工作空间 SerialId
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
     * Get 变量名 
     * @return Name 变量名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 变量名
     * @param Name 变量名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 变量值 
     * @return Value 变量值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 变量值
     * @param Value 变量值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 变量类型  1：显式   2：隐藏 
     * @return Type 变量类型  1：显式   2：隐藏
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 变量类型  1：显式   2：隐藏
     * @param Type 变量类型  1：显式   2：隐藏
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 描述信息 
     * @return Remark 描述信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 描述信息
     * @param Remark 描述信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 工作空间 SerialId 
     * @return WorkSpaceId 工作空间 SerialId
     */
    public String getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set 工作空间 SerialId
     * @param WorkSpaceId 工作空间 SerialId
     */
    public void setWorkSpaceId(String WorkSpaceId) {
        this.WorkSpaceId = WorkSpaceId;
    }

    public CreateVariableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVariableRequest(CreateVariableRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.WorkSpaceId != null) {
            this.WorkSpaceId = new String(source.WorkSpaceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);

    }
}

