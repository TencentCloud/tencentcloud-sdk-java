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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchFileResult extends AbstractModel{

    /**
    * 文件传输的时间
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 姓名
    */
    @SerializedName("RealName")
    @Expose
    private String RealName;

    /**
    * 资产ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 资产名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 资产公网IP
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 资产内网IP
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 操作结果：1 - 已执行，2 - 已阻断
    */
    @SerializedName("Action")
    @Expose
    private Long Action;

    /**
    * 操作类型：1 - 文件上传，2 - 文件下载，3 - 文件删除，4 - 文件(夹)移动，5 - 文件(夹)重命名，6 - 新建文件夹，9 - 删除文件夹
    */
    @SerializedName("Method")
    @Expose
    private Long Method;

    /**
    * 下载的文件（夹）路径及名称
    */
    @SerializedName("FileCurr")
    @Expose
    private String FileCurr;

    /**
    * 上传或新建文件（夹）路径及名称
    */
    @SerializedName("FileNew")
    @Expose
    private String FileNew;

    /**
     * Get 文件传输的时间 
     * @return Time 文件传输的时间
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 文件传输的时间
     * @param Time 文件传输的时间
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 用户名 
     * @return UserName 用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
     * @param UserName 用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 姓名 
     * @return RealName 姓名
     */
    public String getRealName() {
        return this.RealName;
    }

    /**
     * Set 姓名
     * @param RealName 姓名
     */
    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    /**
     * Get 资产ID 
     * @return InstanceId 资产ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 资产ID
     * @param InstanceId 资产ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 资产名称 
     * @return DeviceName 资产名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 资产名称
     * @param DeviceName 资产名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 资产公网IP 
     * @return PublicIp 资产公网IP
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 资产公网IP
     * @param PublicIp 资产公网IP
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 资产内网IP 
     * @return PrivateIp 资产内网IP
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 资产内网IP
     * @param PrivateIp 资产内网IP
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get 操作结果：1 - 已执行，2 - 已阻断 
     * @return Action 操作结果：1 - 已执行，2 - 已阻断
     */
    public Long getAction() {
        return this.Action;
    }

    /**
     * Set 操作结果：1 - 已执行，2 - 已阻断
     * @param Action 操作结果：1 - 已执行，2 - 已阻断
     */
    public void setAction(Long Action) {
        this.Action = Action;
    }

    /**
     * Get 操作类型：1 - 文件上传，2 - 文件下载，3 - 文件删除，4 - 文件(夹)移动，5 - 文件(夹)重命名，6 - 新建文件夹，9 - 删除文件夹 
     * @return Method 操作类型：1 - 文件上传，2 - 文件下载，3 - 文件删除，4 - 文件(夹)移动，5 - 文件(夹)重命名，6 - 新建文件夹，9 - 删除文件夹
     */
    public Long getMethod() {
        return this.Method;
    }

    /**
     * Set 操作类型：1 - 文件上传，2 - 文件下载，3 - 文件删除，4 - 文件(夹)移动，5 - 文件(夹)重命名，6 - 新建文件夹，9 - 删除文件夹
     * @param Method 操作类型：1 - 文件上传，2 - 文件下载，3 - 文件删除，4 - 文件(夹)移动，5 - 文件(夹)重命名，6 - 新建文件夹，9 - 删除文件夹
     */
    public void setMethod(Long Method) {
        this.Method = Method;
    }

    /**
     * Get 下载的文件（夹）路径及名称 
     * @return FileCurr 下载的文件（夹）路径及名称
     */
    public String getFileCurr() {
        return this.FileCurr;
    }

    /**
     * Set 下载的文件（夹）路径及名称
     * @param FileCurr 下载的文件（夹）路径及名称
     */
    public void setFileCurr(String FileCurr) {
        this.FileCurr = FileCurr;
    }

    /**
     * Get 上传或新建文件（夹）路径及名称 
     * @return FileNew 上传或新建文件（夹）路径及名称
     */
    public String getFileNew() {
        return this.FileNew;
    }

    /**
     * Set 上传或新建文件（夹）路径及名称
     * @param FileNew 上传或新建文件（夹）路径及名称
     */
    public void setFileNew(String FileNew) {
        this.FileNew = FileNew;
    }

    public SearchFileResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchFileResult(SearchFileResult source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.RealName != null) {
            this.RealName = new String(source.RealName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.Action != null) {
            this.Action = new Long(source.Action);
        }
        if (source.Method != null) {
            this.Method = new Long(source.Method);
        }
        if (source.FileCurr != null) {
            this.FileCurr = new String(source.FileCurr);
        }
        if (source.FileNew != null) {
            this.FileNew = new String(source.FileNew);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "RealName", this.RealName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "FileCurr", this.FileCurr);
        this.setParamSimple(map, prefix + "FileNew", this.FileNew);

    }
}

