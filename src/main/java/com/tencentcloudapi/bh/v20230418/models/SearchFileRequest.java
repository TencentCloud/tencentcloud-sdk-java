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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchFileRequest extends AbstractModel {

    /**
    * <p>查询开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>查询结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>用户名</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>姓名</p>
    */
    @SerializedName("RealName")
    @Expose
    private String RealName;

    /**
    * <p>资产ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>资产名称</p>
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * <p>资产公网IP</p>
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * <p>资产内网IP</p>
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * <p>操作类型：1 - 文件上传，2 - 文件下载，3 - 文件删除，4 - 文件(夹)移动，5 - 文件(夹)重命名，6 - 新建文件夹，9 - 删除文件夹</p>
    */
    @SerializedName("Method")
    @Expose
    private Long [] Method;

    /**
    * <p>可填写路径名或文件（夹）名</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>1-已放行，  2-已阻断</p>
    */
    @SerializedName("AuditAction")
    @Expose
    private Long [] AuditAction;

    /**
    * <p>分页的页内记录数，默认为20，最大200</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页偏移位置，默认值为0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>查询开始时间</p> 
     * @return StartTime <p>查询开始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>查询开始时间</p>
     * @param StartTime <p>查询开始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>查询结束时间</p> 
     * @return EndTime <p>查询结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>查询结束时间</p>
     * @param EndTime <p>查询结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>用户名</p> 
     * @return UserName <p>用户名</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>用户名</p>
     * @param UserName <p>用户名</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>姓名</p> 
     * @return RealName <p>姓名</p>
     */
    public String getRealName() {
        return this.RealName;
    }

    /**
     * Set <p>姓名</p>
     * @param RealName <p>姓名</p>
     */
    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    /**
     * Get <p>资产ID</p> 
     * @return InstanceId <p>资产ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>资产ID</p>
     * @param InstanceId <p>资产ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>资产名称</p> 
     * @return DeviceName <p>资产名称</p>
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set <p>资产名称</p>
     * @param DeviceName <p>资产名称</p>
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get <p>资产公网IP</p> 
     * @return PublicIp <p>资产公网IP</p>
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set <p>资产公网IP</p>
     * @param PublicIp <p>资产公网IP</p>
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get <p>资产内网IP</p> 
     * @return PrivateIp <p>资产内网IP</p>
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set <p>资产内网IP</p>
     * @param PrivateIp <p>资产内网IP</p>
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get <p>操作类型：1 - 文件上传，2 - 文件下载，3 - 文件删除，4 - 文件(夹)移动，5 - 文件(夹)重命名，6 - 新建文件夹，9 - 删除文件夹</p> 
     * @return Method <p>操作类型：1 - 文件上传，2 - 文件下载，3 - 文件删除，4 - 文件(夹)移动，5 - 文件(夹)重命名，6 - 新建文件夹，9 - 删除文件夹</p>
     */
    public Long [] getMethod() {
        return this.Method;
    }

    /**
     * Set <p>操作类型：1 - 文件上传，2 - 文件下载，3 - 文件删除，4 - 文件(夹)移动，5 - 文件(夹)重命名，6 - 新建文件夹，9 - 删除文件夹</p>
     * @param Method <p>操作类型：1 - 文件上传，2 - 文件下载，3 - 文件删除，4 - 文件(夹)移动，5 - 文件(夹)重命名，6 - 新建文件夹，9 - 删除文件夹</p>
     */
    public void setMethod(Long [] Method) {
        this.Method = Method;
    }

    /**
     * Get <p>可填写路径名或文件（夹）名</p> 
     * @return FileName <p>可填写路径名或文件（夹）名</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>可填写路径名或文件（夹）名</p>
     * @param FileName <p>可填写路径名或文件（夹）名</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>1-已放行，  2-已阻断</p> 
     * @return AuditAction <p>1-已放行，  2-已阻断</p>
     */
    public Long [] getAuditAction() {
        return this.AuditAction;
    }

    /**
     * Set <p>1-已放行，  2-已阻断</p>
     * @param AuditAction <p>1-已放行，  2-已阻断</p>
     */
    public void setAuditAction(Long [] AuditAction) {
        this.AuditAction = AuditAction;
    }

    /**
     * Get <p>分页的页内记录数，默认为20，最大200</p> 
     * @return Limit <p>分页的页内记录数，默认为20，最大200</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页的页内记录数，默认为20，最大200</p>
     * @param Limit <p>分页的页内记录数，默认为20，最大200</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页偏移位置，默认值为0</p> 
     * @return Offset <p>分页偏移位置，默认值为0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移位置，默认值为0</p>
     * @param Offset <p>分页偏移位置，默认值为0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public SearchFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchFileRequest(SearchFileRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
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
        if (source.Method != null) {
            this.Method = new Long[source.Method.length];
            for (int i = 0; i < source.Method.length; i++) {
                this.Method[i] = new Long(source.Method[i]);
            }
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.AuditAction != null) {
            this.AuditAction = new Long[source.AuditAction.length];
            for (int i = 0; i < source.AuditAction.length; i++) {
                this.AuditAction[i] = new Long(source.AuditAction[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "RealName", this.RealName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamArraySimple(map, prefix + "Method.", this.Method);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamArraySimple(map, prefix + "AuditAction.", this.AuditAction);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

