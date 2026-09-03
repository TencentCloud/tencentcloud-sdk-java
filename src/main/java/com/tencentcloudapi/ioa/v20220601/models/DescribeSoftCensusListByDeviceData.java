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
    * <p>终端用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>mac地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MacAddr")
    @Expose
    private String MacAddr;

    /**
    * <p>终端计算机名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>终端组路径名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupNamePath")
    @Expose
    private String GroupNamePath;

    /**
    * <p>IP地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>唯一标识Mid</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mid")
    @Expose
    private String Mid;

    /**
    * <p>企业账户名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IoaUserName")
    @Expose
    private String IoaUserName;

    /**
    * <p>终端分组Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * <p>终端组名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>终端列表Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>软件数量(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SoftNum")
    @Expose
    private Long SoftNum;

    /**
    * <p>盗版风险（1=风险;2=未知）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PiracyRisk")
    @Expose
    private Long PiracyRisk;

    /**
    * <p>终端备注名</p>
    */
    @SerializedName("RemarkName")
    @Expose
    private String RemarkName;

    /**
     * Get <p>终端用户名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName <p>终端用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>终端用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName <p>终端用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>mac地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MacAddr <p>mac地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMacAddr() {
        return this.MacAddr;
    }

    /**
     * Set <p>mac地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MacAddr <p>mac地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMacAddr(String MacAddr) {
        this.MacAddr = MacAddr;
    }

    /**
     * Get <p>终端计算机名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>终端计算机名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>终端计算机名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>终端计算机名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>终端组路径名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupNamePath <p>终端组路径名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupNamePath() {
        return this.GroupNamePath;
    }

    /**
     * Set <p>终端组路径名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupNamePath <p>终端组路径名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupNamePath(String GroupNamePath) {
        this.GroupNamePath = GroupNamePath;
    }

    /**
     * Get <p>IP地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ip <p>IP地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>IP地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ip <p>IP地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>唯一标识Mid</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mid <p>唯一标识Mid</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMid() {
        return this.Mid;
    }

    /**
     * Set <p>唯一标识Mid</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mid <p>唯一标识Mid</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMid(String Mid) {
        this.Mid = Mid;
    }

    /**
     * Get <p>企业账户名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IoaUserName <p>企业账户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIoaUserName() {
        return this.IoaUserName;
    }

    /**
     * Set <p>企业账户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IoaUserName <p>企业账户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIoaUserName(String IoaUserName) {
        this.IoaUserName = IoaUserName;
    }

    /**
     * Get <p>终端分组Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId <p>终端分组Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>终端分组Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId <p>终端分组Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>终端组名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName <p>终端组名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>终端组名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName <p>终端组名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>终端列表Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id <p>终端列表Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>终端列表Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id <p>终端列表Id(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>软件数量(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SoftNum <p>软件数量(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSoftNum() {
        return this.SoftNum;
    }

    /**
     * Set <p>软件数量(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SoftNum <p>软件数量(只支持32位)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSoftNum(Long SoftNum) {
        this.SoftNum = SoftNum;
    }

    /**
     * Get <p>盗版风险（1=风险;2=未知）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PiracyRisk <p>盗版风险（1=风险;2=未知）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPiracyRisk() {
        return this.PiracyRisk;
    }

    /**
     * Set <p>盗版风险（1=风险;2=未知）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PiracyRisk <p>盗版风险（1=风险;2=未知）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPiracyRisk(Long PiracyRisk) {
        this.PiracyRisk = PiracyRisk;
    }

    /**
     * Get <p>终端备注名</p> 
     * @return RemarkName <p>终端备注名</p>
     */
    public String getRemarkName() {
        return this.RemarkName;
    }

    /**
     * Set <p>终端备注名</p>
     * @param RemarkName <p>终端备注名</p>
     */
    public void setRemarkName(String RemarkName) {
        this.RemarkName = RemarkName;
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
        if (source.RemarkName != null) {
            this.RemarkName = new String(source.RemarkName);
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
        this.setParamSimple(map, prefix + "RemarkName", this.RemarkName);

    }
}

