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

public class ResourceConfig extends AbstractModel {

    /**
    * <p>模板ID</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>模板名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>模板类型(ray,spark)</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Head节点配置</p>
    */
    @SerializedName("Head")
    @Expose
    private HeadSpecDTO Head;

    /**
    * <p>Worker节点配置</p>
    */
    @SerializedName("Worker")
    @Expose
    private WorkerSpecDTO [] Worker;

    /**
    * <p>应用ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>创建者UIN</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>子用户UIN</p>
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get <p>模板ID</p> 
     * @return Id <p>模板ID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>模板ID</p>
     * @param Id <p>模板ID</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>模板名称</p> 
     * @return Name <p>模板名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>模板名称</p>
     * @param Name <p>模板名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>模板类型(ray,spark)</p> 
     * @return Type <p>模板类型(ray,spark)</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>模板类型(ray,spark)</p>
     * @param Type <p>模板类型(ray,spark)</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Head节点配置</p> 
     * @return Head <p>Head节点配置</p>
     */
    public HeadSpecDTO getHead() {
        return this.Head;
    }

    /**
     * Set <p>Head节点配置</p>
     * @param Head <p>Head节点配置</p>
     */
    public void setHead(HeadSpecDTO Head) {
        this.Head = Head;
    }

    /**
     * Get <p>Worker节点配置</p> 
     * @return Worker <p>Worker节点配置</p>
     */
    public WorkerSpecDTO [] getWorker() {
        return this.Worker;
    }

    /**
     * Set <p>Worker节点配置</p>
     * @param Worker <p>Worker节点配置</p>
     */
    public void setWorker(WorkerSpecDTO [] Worker) {
        this.Worker = Worker;
    }

    /**
     * Get <p>应用ID</p> 
     * @return AppId <p>应用ID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用ID</p>
     * @param AppId <p>应用ID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>创建者UIN</p> 
     * @return Uin <p>创建者UIN</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>创建者UIN</p>
     * @param Uin <p>创建者UIN</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>子用户UIN</p> 
     * @return SubAccountUin <p>子用户UIN</p>
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set <p>子用户UIN</p>
     * @param SubAccountUin <p>子用户UIN</p>
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public ResourceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceConfig(ResourceConfig source) {
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
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

