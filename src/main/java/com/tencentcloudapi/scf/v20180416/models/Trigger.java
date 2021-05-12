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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Trigger extends AbstractModel{

    /**
    * 触发器最后修改时间
    */
    @SerializedName("ModTime")
    @Expose
    private String ModTime;

    /**
    * 触发器类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 触发器详细配置
    */
    @SerializedName("TriggerDesc")
    @Expose
    private String TriggerDesc;

    /**
    * 触发器名称
    */
    @SerializedName("TriggerName")
    @Expose
    private String TriggerName;

    /**
    * 触发器创建时间
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 使能开关
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 客户自定义参数
    */
    @SerializedName("CustomArgument")
    @Expose
    private String CustomArgument;

    /**
    * 触发器状态
    */
    @SerializedName("AvailableStatus")
    @Expose
    private String AvailableStatus;

    /**
    * 触发器最小资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 触发器和云函数绑定状态
    */
    @SerializedName("BindStatus")
    @Expose
    private String BindStatus;

    /**
    * 触发器类型，双向表示两侧控制台均可操作，单向表示SCF控制台单向创建
    */
    @SerializedName("TriggerAttribute")
    @Expose
    private String TriggerAttribute;

    /**
    * 触发器绑定的别名或版本
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
     * Get 触发器最后修改时间 
     * @return ModTime 触发器最后修改时间
     */
    public String getModTime() {
        return this.ModTime;
    }

    /**
     * Set 触发器最后修改时间
     * @param ModTime 触发器最后修改时间
     */
    public void setModTime(String ModTime) {
        this.ModTime = ModTime;
    }

    /**
     * Get 触发器类型 
     * @return Type 触发器类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 触发器类型
     * @param Type 触发器类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 触发器详细配置 
     * @return TriggerDesc 触发器详细配置
     */
    public String getTriggerDesc() {
        return this.TriggerDesc;
    }

    /**
     * Set 触发器详细配置
     * @param TriggerDesc 触发器详细配置
     */
    public void setTriggerDesc(String TriggerDesc) {
        this.TriggerDesc = TriggerDesc;
    }

    /**
     * Get 触发器名称 
     * @return TriggerName 触发器名称
     */
    public String getTriggerName() {
        return this.TriggerName;
    }

    /**
     * Set 触发器名称
     * @param TriggerName 触发器名称
     */
    public void setTriggerName(String TriggerName) {
        this.TriggerName = TriggerName;
    }

    /**
     * Get 触发器创建时间 
     * @return AddTime 触发器创建时间
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set 触发器创建时间
     * @param AddTime 触发器创建时间
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get 使能开关 
     * @return Enable 使能开关
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 使能开关
     * @param Enable 使能开关
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 客户自定义参数 
     * @return CustomArgument 客户自定义参数
     */
    public String getCustomArgument() {
        return this.CustomArgument;
    }

    /**
     * Set 客户自定义参数
     * @param CustomArgument 客户自定义参数
     */
    public void setCustomArgument(String CustomArgument) {
        this.CustomArgument = CustomArgument;
    }

    /**
     * Get 触发器状态 
     * @return AvailableStatus 触发器状态
     */
    public String getAvailableStatus() {
        return this.AvailableStatus;
    }

    /**
     * Set 触发器状态
     * @param AvailableStatus 触发器状态
     */
    public void setAvailableStatus(String AvailableStatus) {
        this.AvailableStatus = AvailableStatus;
    }

    /**
     * Get 触发器最小资源ID 
     * @return ResourceId 触发器最小资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 触发器最小资源ID
     * @param ResourceId 触发器最小资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 触发器和云函数绑定状态 
     * @return BindStatus 触发器和云函数绑定状态
     */
    public String getBindStatus() {
        return this.BindStatus;
    }

    /**
     * Set 触发器和云函数绑定状态
     * @param BindStatus 触发器和云函数绑定状态
     */
    public void setBindStatus(String BindStatus) {
        this.BindStatus = BindStatus;
    }

    /**
     * Get 触发器类型，双向表示两侧控制台均可操作，单向表示SCF控制台单向创建 
     * @return TriggerAttribute 触发器类型，双向表示两侧控制台均可操作，单向表示SCF控制台单向创建
     */
    public String getTriggerAttribute() {
        return this.TriggerAttribute;
    }

    /**
     * Set 触发器类型，双向表示两侧控制台均可操作，单向表示SCF控制台单向创建
     * @param TriggerAttribute 触发器类型，双向表示两侧控制台均可操作，单向表示SCF控制台单向创建
     */
    public void setTriggerAttribute(String TriggerAttribute) {
        this.TriggerAttribute = TriggerAttribute;
    }

    /**
     * Get 触发器绑定的别名或版本 
     * @return Qualifier 触发器绑定的别名或版本
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set 触发器绑定的别名或版本
     * @param Qualifier 触发器绑定的别名或版本
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    public Trigger() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Trigger(Trigger source) {
        if (source.ModTime != null) {
            this.ModTime = new String(source.ModTime);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TriggerDesc != null) {
            this.TriggerDesc = new String(source.TriggerDesc);
        }
        if (source.TriggerName != null) {
            this.TriggerName = new String(source.TriggerName);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.CustomArgument != null) {
            this.CustomArgument = new String(source.CustomArgument);
        }
        if (source.AvailableStatus != null) {
            this.AvailableStatus = new String(source.AvailableStatus);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.BindStatus != null) {
            this.BindStatus = new String(source.BindStatus);
        }
        if (source.TriggerAttribute != null) {
            this.TriggerAttribute = new String(source.TriggerAttribute);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModTime", this.ModTime);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TriggerDesc", this.TriggerDesc);
        this.setParamSimple(map, prefix + "TriggerName", this.TriggerName);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "CustomArgument", this.CustomArgument);
        this.setParamSimple(map, prefix + "AvailableStatus", this.AvailableStatus);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "BindStatus", this.BindStatus);
        this.setParamSimple(map, prefix + "TriggerAttribute", this.TriggerAttribute);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);

    }
}

