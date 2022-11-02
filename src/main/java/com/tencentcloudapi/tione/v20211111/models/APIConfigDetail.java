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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class APIConfigDetail extends AbstractModel{

    /**
    * 接口id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 接口所属服务组id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceGroupId")
    @Expose
    private String ServiceGroupId;

    /**
    * 接口描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 相对路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelativeUrl")
    @Expose
    private String RelativeUrl;

    /**
    * 服务类型 HTTP HTTPS
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * GET POST
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpMethod")
    @Expose
    private String HttpMethod;

    /**
    * 请求示例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpInputExample")
    @Expose
    private String HttpInputExample;

    /**
    * 回包示例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpOutputExample")
    @Expose
    private String HttpOutputExample;

    /**
    * 更新成员
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedBy")
    @Expose
    private String UpdatedBy;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * 主账号uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 子账号subuin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubUin")
    @Expose
    private String SubUin;

    /**
     * Get 接口id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 接口id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 接口id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 接口id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 接口所属服务组id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceGroupId 接口所属服务组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceGroupId() {
        return this.ServiceGroupId;
    }

    /**
     * Set 接口所属服务组id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceGroupId 接口所属服务组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceGroupId(String ServiceGroupId) {
        this.ServiceGroupId = ServiceGroupId;
    }

    /**
     * Get 接口描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 接口描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 接口描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 接口描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 相对路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelativeUrl 相对路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRelativeUrl() {
        return this.RelativeUrl;
    }

    /**
     * Set 相对路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelativeUrl 相对路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelativeUrl(String RelativeUrl) {
        this.RelativeUrl = RelativeUrl;
    }

    /**
     * Get 服务类型 HTTP HTTPS
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceType 服务类型 HTTP HTTPS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 服务类型 HTTP HTTPS
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceType 服务类型 HTTP HTTPS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get GET POST
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpMethod GET POST
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttpMethod() {
        return this.HttpMethod;
    }

    /**
     * Set GET POST
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpMethod GET POST
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpMethod(String HttpMethod) {
        this.HttpMethod = HttpMethod;
    }

    /**
     * Get 请求示例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpInputExample 请求示例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttpInputExample() {
        return this.HttpInputExample;
    }

    /**
     * Set 请求示例
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpInputExample 请求示例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpInputExample(String HttpInputExample) {
        this.HttpInputExample = HttpInputExample;
    }

    /**
     * Get 回包示例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpOutputExample 回包示例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttpOutputExample() {
        return this.HttpOutputExample;
    }

    /**
     * Set 回包示例
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpOutputExample 回包示例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpOutputExample(String HttpOutputExample) {
        this.HttpOutputExample = HttpOutputExample;
    }

    /**
     * Get 更新成员
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedBy 更新成员
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedBy() {
        return this.UpdatedBy;
    }

    /**
     * Set 更新成员
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedBy 更新成员
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedBy(String UpdatedBy) {
        this.UpdatedBy = UpdatedBy;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 主账号uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 主账号uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 主账号uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 主账号uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 子账号subuin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubUin 子账号subuin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubUin() {
        return this.SubUin;
    }

    /**
     * Set 子账号subuin
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubUin 子账号subuin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubUin(String SubUin) {
        this.SubUin = SubUin;
    }

    public APIConfigDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public APIConfigDetail(APIConfigDetail source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.ServiceGroupId != null) {
            this.ServiceGroupId = new String(source.ServiceGroupId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RelativeUrl != null) {
            this.RelativeUrl = new String(source.RelativeUrl);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.HttpMethod != null) {
            this.HttpMethod = new String(source.HttpMethod);
        }
        if (source.HttpInputExample != null) {
            this.HttpInputExample = new String(source.HttpInputExample);
        }
        if (source.HttpOutputExample != null) {
            this.HttpOutputExample = new String(source.HttpOutputExample);
        }
        if (source.UpdatedBy != null) {
            this.UpdatedBy = new String(source.UpdatedBy);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SubUin != null) {
            this.SubUin = new String(source.SubUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ServiceGroupId", this.ServiceGroupId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RelativeUrl", this.RelativeUrl);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "HttpMethod", this.HttpMethod);
        this.setParamSimple(map, prefix + "HttpInputExample", this.HttpInputExample);
        this.setParamSimple(map, prefix + "HttpOutputExample", this.HttpOutputExample);
        this.setParamSimple(map, prefix + "UpdatedBy", this.UpdatedBy);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);

    }
}

