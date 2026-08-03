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

public class GetResourceConfigResponse extends AbstractModel {

    /**
    * 模板ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 模板名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 模板类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Head节点配置
    */
    @SerializedName("Head")
    @Expose
    private HeadSpecDTO Head;

    /**
    * Worker节点配置
    */
    @SerializedName("Worker")
    @Expose
    private WorkerSpecDTO [] Worker;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 应用ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 创建者UIN
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 子用户UIN
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 模板ID 
     * @return Id 模板ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 模板ID
     * @param Id 模板ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 模板名称 
     * @return Name 模板名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模板名称
     * @param Name 模板名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 模板类型 
     * @return Type 模板类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 模板类型
     * @param Type 模板类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Head节点配置 
     * @return Head Head节点配置
     */
    public HeadSpecDTO getHead() {
        return this.Head;
    }

    /**
     * Set Head节点配置
     * @param Head Head节点配置
     */
    public void setHead(HeadSpecDTO Head) {
        this.Head = Head;
    }

    /**
     * Get Worker节点配置 
     * @return Worker Worker节点配置
     */
    public WorkerSpecDTO [] getWorker() {
        return this.Worker;
    }

    /**
     * Set Worker节点配置
     * @param Worker Worker节点配置
     */
    public void setWorker(WorkerSpecDTO [] Worker) {
        this.Worker = Worker;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 应用ID 
     * @return AppId 应用ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 应用ID
     * @param AppId 应用ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 创建者UIN 
     * @return Uin 创建者UIN
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 创建者UIN
     * @param Uin 创建者UIN
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 子用户UIN 
     * @return SubAccountUin 子用户UIN
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set 子用户UIN
     * @param SubAccountUin 子用户UIN
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
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

    public GetResourceConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetResourceConfigResponse(GetResourceConfigResponse source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Head != null) {
            this.Head = new HeadSpecDTO(source.Head);
        }
        if (source.Worker != null) {
            this.Worker = new WorkerSpecDTO[source.Worker.length];
            for (int i = 0; i < source.Worker.length; i++) {
                this.Worker[i] = new WorkerSpecDTO(source.Worker[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
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
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Head.", this.Head);
        this.setParamArrayObj(map, prefix + "Worker.", this.Worker);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

