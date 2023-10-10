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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JavaMemShellDetail extends AbstractModel{

    /**
    * 容器名
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例状态：RUNNING,STOPPED,SHUTDOWN...
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
    * 内网IP
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 公共ip
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

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
    * java加载器类名
    */
    @SerializedName("ClassLoaderName")
    @Expose
    private String ClassLoaderName;

    /**
    * 父类名
    */
    @SerializedName("SuperClassName")
    @Expose
    private String SuperClassName;

    /**
    * 类文件MD5
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

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
    * 进程pid
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * java进程路径
    */
    @SerializedName("Exe")
    @Expose
    private String Exe;

    /**
    * java进程命令行参数
    */
    @SerializedName("Args")
    @Expose
    private String Args;

    /**
    * 类名
    */
    @SerializedName("ClassName")
    @Expose
    private String ClassName;

    /**
    * java内存马二进制代码(base64)
    */
    @SerializedName("ClassContent")
    @Expose
    private String ClassContent;

    /**
    * java内存马反编译代码
    */
    @SerializedName("ClassContentPretty")
    @Expose
    private String ClassContentPretty;

    /**
    * 事件描述
    */
    @SerializedName("EventDescription")
    @Expose
    private String EventDescription;

    /**
    * 安全建议
    */
    @SerializedName("SecurityAdvice")
    @Expose
    private String SecurityAdvice;

    /**
    *  主机额外信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * 实例状态：RUNNING,STOPPED,SHUTDOWN...
    */
    @SerializedName("MachineState")
    @Expose
    private String MachineState;

    /**
     * Get 容器名 
     * @return InstanceName 容器名
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 容器名
     * @param InstanceName 容器名
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例状态：RUNNING,STOPPED,SHUTDOWN... 
     * @return InstanceState 实例状态：RUNNING,STOPPED,SHUTDOWN...
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set 实例状态：RUNNING,STOPPED,SHUTDOWN...
     * @param InstanceState 实例状态：RUNNING,STOPPED,SHUTDOWN...
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * Get 内网IP 
     * @return PrivateIp 内网IP
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 内网IP
     * @param PrivateIp 内网IP
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get 公共ip 
     * @return PublicIp 公共ip
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 公共ip
     * @param PublicIp 公共ip
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
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
     * Get java加载器类名 
     * @return ClassLoaderName java加载器类名
     */
    public String getClassLoaderName() {
        return this.ClassLoaderName;
    }

    /**
     * Set java加载器类名
     * @param ClassLoaderName java加载器类名
     */
    public void setClassLoaderName(String ClassLoaderName) {
        this.ClassLoaderName = ClassLoaderName;
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
     * Get 类文件MD5 
     * @return Md5 类文件MD5
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set 类文件MD5
     * @param Md5 类文件MD5
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
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
     * Get 进程pid 
     * @return Pid 进程pid
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set 进程pid
     * @param Pid 进程pid
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get java进程路径 
     * @return Exe java进程路径
     */
    public String getExe() {
        return this.Exe;
    }

    /**
     * Set java进程路径
     * @param Exe java进程路径
     */
    public void setExe(String Exe) {
        this.Exe = Exe;
    }

    /**
     * Get java进程命令行参数 
     * @return Args java进程命令行参数
     */
    public String getArgs() {
        return this.Args;
    }

    /**
     * Set java进程命令行参数
     * @param Args java进程命令行参数
     */
    public void setArgs(String Args) {
        this.Args = Args;
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
     * Get java内存马二进制代码(base64) 
     * @return ClassContent java内存马二进制代码(base64)
     */
    public String getClassContent() {
        return this.ClassContent;
    }

    /**
     * Set java内存马二进制代码(base64)
     * @param ClassContent java内存马二进制代码(base64)
     */
    public void setClassContent(String ClassContent) {
        this.ClassContent = ClassContent;
    }

    /**
     * Get java内存马反编译代码 
     * @return ClassContentPretty java内存马反编译代码
     */
    public String getClassContentPretty() {
        return this.ClassContentPretty;
    }

    /**
     * Set java内存马反编译代码
     * @param ClassContentPretty java内存马反编译代码
     */
    public void setClassContentPretty(String ClassContentPretty) {
        this.ClassContentPretty = ClassContentPretty;
    }

    /**
     * Get 事件描述 
     * @return EventDescription 事件描述
     */
    public String getEventDescription() {
        return this.EventDescription;
    }

    /**
     * Set 事件描述
     * @param EventDescription 事件描述
     */
    public void setEventDescription(String EventDescription) {
        this.EventDescription = EventDescription;
    }

    /**
     * Get 安全建议 
     * @return SecurityAdvice 安全建议
     */
    public String getSecurityAdvice() {
        return this.SecurityAdvice;
    }

    /**
     * Set 安全建议
     * @param SecurityAdvice 安全建议
     */
    public void setSecurityAdvice(String SecurityAdvice) {
        this.SecurityAdvice = SecurityAdvice;
    }

    /**
     * Get  主机额外信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MachineExtraInfo  主机额外信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set  主机额外信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param MachineExtraInfo  主机额外信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    /**
     * Get 实例状态：RUNNING,STOPPED,SHUTDOWN... 
     * @return MachineState 实例状态：RUNNING,STOPPED,SHUTDOWN...
     */
    public String getMachineState() {
        return this.MachineState;
    }

    /**
     * Set 实例状态：RUNNING,STOPPED,SHUTDOWN...
     * @param MachineState 实例状态：RUNNING,STOPPED,SHUTDOWN...
     */
    public void setMachineState(String MachineState) {
        this.MachineState = MachineState;
    }

    public JavaMemShellDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JavaMemShellDetail(JavaMemShellDetail source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
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
        if (source.ClassLoaderName != null) {
            this.ClassLoaderName = new String(source.ClassLoaderName);
        }
        if (source.SuperClassName != null) {
            this.SuperClassName = new String(source.SuperClassName);
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
        if (source.Interfaces != null) {
            this.Interfaces = new String(source.Interfaces);
        }
        if (source.Annotations != null) {
            this.Annotations = new String(source.Annotations);
        }
        if (source.Pid != null) {
            this.Pid = new Long(source.Pid);
        }
        if (source.Exe != null) {
            this.Exe = new String(source.Exe);
        }
        if (source.Args != null) {
            this.Args = new String(source.Args);
        }
        if (source.ClassName != null) {
            this.ClassName = new String(source.ClassName);
        }
        if (source.ClassContent != null) {
            this.ClassContent = new String(source.ClassContent);
        }
        if (source.ClassContentPretty != null) {
            this.ClassContentPretty = new String(source.ClassContentPretty);
        }
        if (source.EventDescription != null) {
            this.EventDescription = new String(source.EventDescription);
        }
        if (source.SecurityAdvice != null) {
            this.SecurityAdvice = new String(source.SecurityAdvice);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
        if (source.MachineState != null) {
            this.MachineState = new String(source.MachineState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RecentFoundTime", this.RecentFoundTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ClassLoaderName", this.ClassLoaderName);
        this.setParamSimple(map, prefix + "SuperClassName", this.SuperClassName);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "Interfaces", this.Interfaces);
        this.setParamSimple(map, prefix + "Annotations", this.Annotations);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "Exe", this.Exe);
        this.setParamSimple(map, prefix + "Args", this.Args);
        this.setParamSimple(map, prefix + "ClassName", this.ClassName);
        this.setParamSimple(map, prefix + "ClassContent", this.ClassContent);
        this.setParamSimple(map, prefix + "ClassContentPretty", this.ClassContentPretty);
        this.setParamSimple(map, prefix + "EventDescription", this.EventDescription);
        this.setParamSimple(map, prefix + "SecurityAdvice", this.SecurityAdvice);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);
        this.setParamSimple(map, prefix + "MachineState", this.MachineState);

    }
}

