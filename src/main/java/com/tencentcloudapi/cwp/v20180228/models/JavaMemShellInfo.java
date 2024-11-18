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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JavaMemShellInfo extends AbstractModel {

    /**
    * 事件ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 服务器名称
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 服务器IP
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * 内存马类型  0:Filter型 1:Listener型 2:Servlet型 3:Interceptors型 4:Agent型 5:其他
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 说明
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 首次发现时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最近检测时间
    */
    @SerializedName("RecentFoundTime")
    @Expose
    private String RecentFoundTime;

    /**
    * 处理状态  0 -- 待处理 1 -- 已加白 2 -- 已删除 3 - 已忽略  4 - 已手动处理
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 服务器quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 主机额外信息
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * 服务器uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 类名
    */
    @SerializedName("ClassName")
    @Expose
    private String ClassName;

    /**
    * 父类名
    */
    @SerializedName("SuperClassName")
    @Expose
    private String SuperClassName;

    /**
    * 继承的接口
    */
    @SerializedName("Interfaces")
    @Expose
    private String Interfaces;

    /**
    * 注释
    */
    @SerializedName("Annotations")
    @Expose
    private String Annotations;

    /**
    * 所属的类加载器
    */
    @SerializedName("LoaderClassName")
    @Expose
    private String LoaderClassName;

    /**
     * Get 事件ID 
     * @return Id 事件ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 事件ID
     * @param Id 事件ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 服务器名称 
     * @return Alias 服务器名称
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 服务器名称
     * @param Alias 服务器名称
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 服务器IP 
     * @return HostIp 服务器IP
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set 服务器IP
     * @param HostIp 服务器IP
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get 内存马类型  0:Filter型 1:Listener型 2:Servlet型 3:Interceptors型 4:Agent型 5:其他 
     * @return Type 内存马类型  0:Filter型 1:Listener型 2:Servlet型 3:Interceptors型 4:Agent型 5:其他
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 内存马类型  0:Filter型 1:Listener型 2:Servlet型 3:Interceptors型 4:Agent型 5:其他
     * @param Type 内存马类型  0:Filter型 1:Listener型 2:Servlet型 3:Interceptors型 4:Agent型 5:其他
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 说明 
     * @return Description 说明
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 说明
     * @param Description 说明
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 首次发现时间 
     * @return CreateTime 首次发现时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 首次发现时间
     * @param CreateTime 首次发现时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最近检测时间 
     * @return RecentFoundTime 最近检测时间
     */
    public String getRecentFoundTime() {
        return this.RecentFoundTime;
    }

    /**
     * Set 最近检测时间
     * @param RecentFoundTime 最近检测时间
     */
    public void setRecentFoundTime(String RecentFoundTime) {
        this.RecentFoundTime = RecentFoundTime;
    }

    /**
     * Get 处理状态  0 -- 待处理 1 -- 已加白 2 -- 已删除 3 - 已忽略  4 - 已手动处理 
     * @return Status 处理状态  0 -- 待处理 1 -- 已加白 2 -- 已删除 3 - 已忽略  4 - 已手动处理
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 处理状态  0 -- 待处理 1 -- 已加白 2 -- 已删除 3 - 已忽略  4 - 已手动处理
     * @param Status 处理状态  0 -- 待处理 1 -- 已加白 2 -- 已删除 3 - 已忽略  4 - 已手动处理
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 服务器quuid 
     * @return Quuid 服务器quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 服务器quuid
     * @param Quuid 服务器quuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 主机额外信息 
     * @return MachineExtraInfo 主机额外信息
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set 主机额外信息
     * @param MachineExtraInfo 主机额外信息
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    /**
     * Get 服务器uuid 
     * @return Uuid 服务器uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 服务器uuid
     * @param Uuid 服务器uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 类名 
     * @return ClassName 类名
     */
    public String getClassName() {
        return this.ClassName;
    }

    /**
     * Set 类名
     * @param ClassName 类名
     */
    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    /**
     * Get 父类名 
     * @return SuperClassName 父类名
     */
    public String getSuperClassName() {
        return this.SuperClassName;
    }

    /**
     * Set 父类名
     * @param SuperClassName 父类名
     */
    public void setSuperClassName(String SuperClassName) {
        this.SuperClassName = SuperClassName;
    }

    /**
     * Get 继承的接口 
     * @return Interfaces 继承的接口
     */
    public String getInterfaces() {
        return this.Interfaces;
    }

    /**
     * Set 继承的接口
     * @param Interfaces 继承的接口
     */
    public void setInterfaces(String Interfaces) {
        this.Interfaces = Interfaces;
    }

    /**
     * Get 注释 
     * @return Annotations 注释
     */
    public String getAnnotations() {
        return this.Annotations;
    }

    /**
     * Set 注释
     * @param Annotations 注释
     */
    public void setAnnotations(String Annotations) {
        this.Annotations = Annotations;
    }

    /**
     * Get 所属的类加载器 
     * @return LoaderClassName 所属的类加载器
     */
    public String getLoaderClassName() {
        return this.LoaderClassName;
    }

    /**
     * Set 所属的类加载器
     * @param LoaderClassName 所属的类加载器
     */
    public void setLoaderClassName(String LoaderClassName) {
        this.LoaderClassName = LoaderClassName;
    }

    public JavaMemShellInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JavaMemShellInfo(JavaMemShellInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RecentFoundTime != null) {
            this.RecentFoundTime = new String(source.RecentFoundTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.ClassName != null) {
            this.ClassName = new String(source.ClassName);
        }
        if (source.SuperClassName != null) {
            this.SuperClassName = new String(source.SuperClassName);
        }
        if (source.Interfaces != null) {
            this.Interfaces = new String(source.Interfaces);
        }
        if (source.Annotations != null) {
            this.Annotations = new String(source.Annotations);
        }
        if (source.LoaderClassName != null) {
            this.LoaderClassName = new String(source.LoaderClassName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RecentFoundTime", this.RecentFoundTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "ClassName", this.ClassName);
        this.setParamSimple(map, prefix + "SuperClassName", this.SuperClassName);
        this.setParamSimple(map, prefix + "Interfaces", this.Interfaces);
        this.setParamSimple(map, prefix + "Annotations", this.Annotations);
        this.setParamSimple(map, prefix + "LoaderClassName", this.LoaderClassName);

    }
}

