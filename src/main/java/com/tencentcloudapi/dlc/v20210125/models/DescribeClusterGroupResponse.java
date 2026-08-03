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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterGroupResponse extends AbstractModel {

    /**
    * <p>集群组 ID（系统生成）</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>集群组名称（同一 AppId 下唯一）</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>集群组描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>集群组配置</p>
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * <p>应用 ID（多租户）</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>创建者主账号 UIN</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>创建者子账号 UIN</p>
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * <p>创建时间（毫秒时间戳）</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>更新时间（毫秒时间戳）</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>是否已软删除（false=活跃，true=已删除）</p>
    */
    @SerializedName("Deleted")
    @Expose
    private Boolean Deleted;

    /**
    * <p>删除时间（软删时写入，活跃记录为 null）</p>
    */
    @SerializedName("DeleteTime")
    @Expose
    private Long DeleteTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>集群组 ID（系统生成）</p> 
     * @return Id <p>集群组 ID（系统生成）</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>集群组 ID（系统生成）</p>
     * @param Id <p>集群组 ID（系统生成）</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>集群组名称（同一 AppId 下唯一）</p> 
     * @return Name <p>集群组名称（同一 AppId 下唯一）</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>集群组名称（同一 AppId 下唯一）</p>
     * @param Name <p>集群组名称（同一 AppId 下唯一）</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>集群组描述</p> 
     * @return Description <p>集群组描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>集群组描述</p>
     * @param Description <p>集群组描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>集群组配置</p> 
     * @return Config <p>集群组配置</p>
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set <p>集群组配置</p>
     * @param Config <p>集群组配置</p>
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get <p>应用 ID（多租户）</p> 
     * @return AppId <p>应用 ID（多租户）</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用 ID（多租户）</p>
     * @param AppId <p>应用 ID（多租户）</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>创建者主账号 UIN</p> 
     * @return Uin <p>创建者主账号 UIN</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>创建者主账号 UIN</p>
     * @param Uin <p>创建者主账号 UIN</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>创建者子账号 UIN</p> 
     * @return SubAccountUin <p>创建者子账号 UIN</p>
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set <p>创建者子账号 UIN</p>
     * @param SubAccountUin <p>创建者子账号 UIN</p>
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get <p>创建时间（毫秒时间戳）</p> 
     * @return CreateTime <p>创建时间（毫秒时间戳）</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间（毫秒时间戳）</p>
     * @param CreateTime <p>创建时间（毫秒时间戳）</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间（毫秒时间戳）</p> 
     * @return UpdateTime <p>更新时间（毫秒时间戳）</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间（毫秒时间戳）</p>
     * @param UpdateTime <p>更新时间（毫秒时间戳）</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>是否已软删除（false=活跃，true=已删除）</p> 
     * @return Deleted <p>是否已软删除（false=活跃，true=已删除）</p>
     */
    public Boolean getDeleted() {
        return this.Deleted;
    }

    /**
     * Set <p>是否已软删除（false=活跃，true=已删除）</p>
     * @param Deleted <p>是否已软删除（false=活跃，true=已删除）</p>
     */
    public void setDeleted(Boolean Deleted) {
        this.Deleted = Deleted;
    }

    /**
     * Get <p>删除时间（软删时写入，活跃记录为 null）</p> 
     * @return DeleteTime <p>删除时间（软删时写入，活跃记录为 null）</p>
     */
    public Long getDeleteTime() {
        return this.DeleteTime;
    }

    /**
     * Set <p>删除时间（软删时写入，活跃记录为 null）</p>
     * @param DeleteTime <p>删除时间（软删时写入，活跃记录为 null）</p>
     */
    public void setDeleteTime(Long DeleteTime) {
        this.DeleteTime = DeleteTime;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeClusterGroupResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterGroupResponse(DescribeClusterGroupResponse source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.Deleted != null) {
            this.Deleted = new Boolean(source.Deleted);
        }
        if (source.DeleteTime != null) {
            this.DeleteTime = new Long(source.DeleteTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Deleted", this.Deleted);
        this.setParamSimple(map, prefix + "DeleteTime", this.DeleteTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

