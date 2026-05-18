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
    * <p>变量名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>变量值</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * <p>变量类型  1：显式   2：隐藏</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>描述信息</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>工作空间 SerialId</p>
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
    * <p>变量值类型</p><p>枚举值：</p><ul><li>0： 自定义变量</li><li>1： 凭据值</li></ul>
    */
    @SerializedName("ValueType")
    @Expose
    private Long ValueType;

    /**
    * <p>凭据所在地域</p>
    */
    @SerializedName("SecretRegion")
    @Expose
    private String SecretRegion;

    /**
    * <p>凭据名称</p>
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * <p>凭据版本</p>
    */
    @SerializedName("SecretVersionId")
    @Expose
    private String SecretVersionId;

    /**
    * <p>凭据值md5</p>
    */
    @SerializedName("SecretValueMd5")
    @Expose
    private String SecretValueMd5;

    /**
     * Get <p>变量名</p> 
     * @return Name <p>变量名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>变量名</p>
     * @param Name <p>变量名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>变量值</p> 
     * @return Value <p>变量值</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>变量值</p>
     * @param Value <p>变量值</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get <p>变量类型  1：显式   2：隐藏</p> 
     * @return Type <p>变量类型  1：显式   2：隐藏</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>变量类型  1：显式   2：隐藏</p>
     * @param Type <p>变量类型  1：显式   2：隐藏</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>描述信息</p> 
     * @return Remark <p>描述信息</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>描述信息</p>
     * @param Remark <p>描述信息</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>工作空间 SerialId</p> 
     * @return WorkSpaceId <p>工作空间 SerialId</p>
     */
    public String getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set <p>工作空间 SerialId</p>
     * @param WorkSpaceId <p>工作空间 SerialId</p>
     */
    public void setWorkSpaceId(String WorkSpaceId) {
        this.WorkSpaceId = WorkSpaceId;
    }

    /**
     * Get <p>变量值类型</p><p>枚举值：</p><ul><li>0： 自定义变量</li><li>1： 凭据值</li></ul> 
     * @return ValueType <p>变量值类型</p><p>枚举值：</p><ul><li>0： 自定义变量</li><li>1： 凭据值</li></ul>
     */
    public Long getValueType() {
        return this.ValueType;
    }

    /**
     * Set <p>变量值类型</p><p>枚举值：</p><ul><li>0： 自定义变量</li><li>1： 凭据值</li></ul>
     * @param ValueType <p>变量值类型</p><p>枚举值：</p><ul><li>0： 自定义变量</li><li>1： 凭据值</li></ul>
     */
    public void setValueType(Long ValueType) {
        this.ValueType = ValueType;
    }

    /**
     * Get <p>凭据所在地域</p> 
     * @return SecretRegion <p>凭据所在地域</p>
     */
    public String getSecretRegion() {
        return this.SecretRegion;
    }

    /**
     * Set <p>凭据所在地域</p>
     * @param SecretRegion <p>凭据所在地域</p>
     */
    public void setSecretRegion(String SecretRegion) {
        this.SecretRegion = SecretRegion;
    }

    /**
     * Get <p>凭据名称</p> 
     * @return SecretName <p>凭据名称</p>
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set <p>凭据名称</p>
     * @param SecretName <p>凭据名称</p>
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get <p>凭据版本</p> 
     * @return SecretVersionId <p>凭据版本</p>
     */
    public String getSecretVersionId() {
        return this.SecretVersionId;
    }

    /**
     * Set <p>凭据版本</p>
     * @param SecretVersionId <p>凭据版本</p>
     */
    public void setSecretVersionId(String SecretVersionId) {
        this.SecretVersionId = SecretVersionId;
    }

    /**
     * Get <p>凭据值md5</p> 
     * @return SecretValueMd5 <p>凭据值md5</p>
     */
    public String getSecretValueMd5() {
        return this.SecretValueMd5;
    }

    /**
     * Set <p>凭据值md5</p>
     * @param SecretValueMd5 <p>凭据值md5</p>
     */
    public void setSecretValueMd5(String SecretValueMd5) {
        this.SecretValueMd5 = SecretValueMd5;
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
        if (source.ValueType != null) {
            this.ValueType = new Long(source.ValueType);
        }
        if (source.SecretRegion != null) {
            this.SecretRegion = new String(source.SecretRegion);
        }
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.SecretVersionId != null) {
            this.SecretVersionId = new String(source.SecretVersionId);
        }
        if (source.SecretValueMd5 != null) {
            this.SecretValueMd5 = new String(source.SecretValueMd5);
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
        this.setParamSimple(map, prefix + "ValueType", this.ValueType);
        this.setParamSimple(map, prefix + "SecretRegion", this.SecretRegion);
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "SecretVersionId", this.SecretVersionId);
        this.setParamSimple(map, prefix + "SecretValueMd5", this.SecretValueMd5);

    }
}

