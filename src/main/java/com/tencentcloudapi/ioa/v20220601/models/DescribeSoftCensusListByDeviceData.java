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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSoftCensusListByDeviceData extends AbstractModel {

    /**
    * 终端用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * mac地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MacAddr")
    @Expose
    private String MacAddr;

    /**
    * 终端计算机名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 终端组路径名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupNamePath")
    @Expose
    private String GroupNamePath;

    /**
    * IP地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 唯一标识Mid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mid")
    @Expose
    private String Mid;

    /**
    * 企业账户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IoaUserName")
    @Expose
    private String IoaUserName;

    /**
    * 终端分组Id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 终端组名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 终端列表Id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 软件数量(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SoftNum")
    @Expose
    private Long SoftNum;

    /**
    * 盗版风险（1=风险;2=未知）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PiracyRisk")
    @Expose
    private Long PiracyRisk;

    /**
     * Get 终端用户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName 终端用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 终端用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName 终端用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get mac地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MacAddr mac地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMacAddr() {
        return this.MacAddr;
    }

    /**
     * Set mac地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param MacAddr mac地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMacAddr(String MacAddr) {
        this.MacAddr = MacAddr;
    }

    /**
     * Get 终端计算机名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 终端计算机名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 终端计算机名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 终端计算机名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 终端组路径名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupNamePath 终端组路径名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupNamePath() {
        return this.GroupNamePath;
    }

    /**
     * Set 终端组路径名
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupNamePath 终端组路径名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupNamePath(String GroupNamePath) {
        this.GroupNamePath = GroupNamePath;
    }

    /**
     * Get IP地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ip IP地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ip IP地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 唯一标识Mid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mid 唯一标识Mid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMid() {
        return this.Mid;
    }

    /**
     * Set 唯一标识Mid
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mid 唯一标识Mid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMid(String Mid) {
        this.Mid = Mid;
    }

    /**
     * Get 企业账户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IoaUserName 企业账户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIoaUserName() {
        return this.IoaUserName;
    }

    /**
     * Set 企业账户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param IoaUserName 企业账户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIoaUserName(String IoaUserName) {
        this.IoaUserName = IoaUserName;
    }

    /**
     * Get 终端分组Id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId 终端分组Id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 终端分组Id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId 终端分组Id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 终端组名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName 终端组名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 终端组名
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName 终端组名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 终端列表Id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 终端列表Id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 终端列表Id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 终端列表Id(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 软件数量(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SoftNum 软件数量(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSoftNum() {
        return this.SoftNum;
    }

    /**
     * Set 软件数量(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     * @param SoftNum 软件数量(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSoftNum(Long SoftNum) {
        this.SoftNum = SoftNum;
    }

    /**
     * Get 盗版风险（1=风险;2=未知）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PiracyRisk 盗版风险（1=风险;2=未知）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPiracyRisk() {
        return this.PiracyRisk;
    }

    /**
     * Set 盗版风险（1=风险;2=未知）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PiracyRisk 盗版风险（1=风险;2=未知）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPiracyRisk(Long PiracyRisk) {
        this.PiracyRisk = PiracyRisk;
    }

    public DescribeSoftCensusListByDeviceData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSoftCensusListByDeviceData(DescribeSoftCensusListByDeviceData source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.MacAddr != null) {
            this.MacAddr = new String(source.MacAddr);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.GroupNamePath != null) {
            this.GroupNamePath = new String(source.GroupNamePath);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Mid != null) {
            this.Mid = new String(source.Mid);
        }
        if (source.IoaUserName != null) {
            this.IoaUserName = new String(source.IoaUserName);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.SoftNum != null) {
            this.SoftNum = new Long(source.SoftNum);
        }
        if (source.PiracyRisk != null) {
            this.PiracyRisk = new Long(source.PiracyRisk);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "MacAddr", this.MacAddr);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "GroupNamePath", this.GroupNamePath);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Mid", this.Mid);
        this.setParamSimple(map, prefix + "IoaUserName", this.IoaUserName);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "SoftNum", this.SoftNum);
        this.setParamSimple(map, prefix + "PiracyRisk", this.PiracyRisk);

    }
}

