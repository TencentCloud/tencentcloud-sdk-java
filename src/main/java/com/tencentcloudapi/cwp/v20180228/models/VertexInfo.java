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

public class VertexInfo extends AbstractModel{

    /**
    * 该结点类型，进程:1；网络:2；文件:3；ssh:4；
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 该节点包含的vid
    */
    @SerializedName("Vid")
    @Expose
    private String Vid;

    /**
    * 该节点的父节点vid
    */
    @SerializedName("ParentVid")
    @Expose
    private String ParentVid;

    /**
    * 是否叶子
    */
    @SerializedName("IsLeaf")
    @Expose
    private Boolean IsLeaf;

    /**
    * 进程名，当Type=1时使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcNamePrefix")
    @Expose
    private String ProcNamePrefix;

    /**
    * 进程名md5，当Type=1时使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcNameMd5")
    @Expose
    private String ProcNameMd5;

    /**
    * 命令行，当Type=1时使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CmdLinePrefix")
    @Expose
    private String CmdLinePrefix;

    /**
    * 命令行md5，当Type=1时使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CmdLineMd5")
    @Expose
    private String CmdLineMd5;

    /**
    * 文件路径，当Type=3时使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilePathPrefix")
    @Expose
    private String FilePathPrefix;

    /**
    * 请求目的地址，当Type=2时使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddressPrefix")
    @Expose
    private String AddressPrefix;

    /**
    * 是否漏洞节点
    */
    @SerializedName("IsWeDetect")
    @Expose
    private Boolean IsWeDetect;

    /**
    * 是否告警节点
    */
    @SerializedName("IsAlarm")
    @Expose
    private Boolean IsAlarm;

    /**
    * 文件路径md5，当Type=3时使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilePathMd5")
    @Expose
    private String FilePathMd5;

    /**
    * 请求目的地址md5，当Type=2时使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddressMd5")
    @Expose
    private String AddressMd5;

    /**
     * Get 该结点类型，进程:1；网络:2；文件:3；ssh:4； 
     * @return Type 该结点类型，进程:1；网络:2；文件:3；ssh:4；
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 该结点类型，进程:1；网络:2；文件:3；ssh:4；
     * @param Type 该结点类型，进程:1；网络:2；文件:3；ssh:4；
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 该节点包含的vid 
     * @return Vid 该节点包含的vid
     */
    public String getVid() {
        return this.Vid;
    }

    /**
     * Set 该节点包含的vid
     * @param Vid 该节点包含的vid
     */
    public void setVid(String Vid) {
        this.Vid = Vid;
    }

    /**
     * Get 该节点的父节点vid 
     * @return ParentVid 该节点的父节点vid
     */
    public String getParentVid() {
        return this.ParentVid;
    }

    /**
     * Set 该节点的父节点vid
     * @param ParentVid 该节点的父节点vid
     */
    public void setParentVid(String ParentVid) {
        this.ParentVid = ParentVid;
    }

    /**
     * Get 是否叶子 
     * @return IsLeaf 是否叶子
     */
    public Boolean getIsLeaf() {
        return this.IsLeaf;
    }

    /**
     * Set 是否叶子
     * @param IsLeaf 是否叶子
     */
    public void setIsLeaf(Boolean IsLeaf) {
        this.IsLeaf = IsLeaf;
    }

    /**
     * Get 进程名，当Type=1时使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcNamePrefix 进程名，当Type=1时使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcNamePrefix() {
        return this.ProcNamePrefix;
    }

    /**
     * Set 进程名，当Type=1时使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcNamePrefix 进程名，当Type=1时使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcNamePrefix(String ProcNamePrefix) {
        this.ProcNamePrefix = ProcNamePrefix;
    }

    /**
     * Get 进程名md5，当Type=1时使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcNameMd5 进程名md5，当Type=1时使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcNameMd5() {
        return this.ProcNameMd5;
    }

    /**
     * Set 进程名md5，当Type=1时使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcNameMd5 进程名md5，当Type=1时使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcNameMd5(String ProcNameMd5) {
        this.ProcNameMd5 = ProcNameMd5;
    }

    /**
     * Get 命令行，当Type=1时使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CmdLinePrefix 命令行，当Type=1时使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCmdLinePrefix() {
        return this.CmdLinePrefix;
    }

    /**
     * Set 命令行，当Type=1时使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param CmdLinePrefix 命令行，当Type=1时使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCmdLinePrefix(String CmdLinePrefix) {
        this.CmdLinePrefix = CmdLinePrefix;
    }

    /**
     * Get 命令行md5，当Type=1时使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CmdLineMd5 命令行md5，当Type=1时使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCmdLineMd5() {
        return this.CmdLineMd5;
    }

    /**
     * Set 命令行md5，当Type=1时使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param CmdLineMd5 命令行md5，当Type=1时使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCmdLineMd5(String CmdLineMd5) {
        this.CmdLineMd5 = CmdLineMd5;
    }

    /**
     * Get 文件路径，当Type=3时使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilePathPrefix 文件路径，当Type=3时使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFilePathPrefix() {
        return this.FilePathPrefix;
    }

    /**
     * Set 文件路径，当Type=3时使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilePathPrefix 文件路径，当Type=3时使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilePathPrefix(String FilePathPrefix) {
        this.FilePathPrefix = FilePathPrefix;
    }

    /**
     * Get 请求目的地址，当Type=2时使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddressPrefix 请求目的地址，当Type=2时使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddressPrefix() {
        return this.AddressPrefix;
    }

    /**
     * Set 请求目的地址，当Type=2时使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddressPrefix 请求目的地址，当Type=2时使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddressPrefix(String AddressPrefix) {
        this.AddressPrefix = AddressPrefix;
    }

    /**
     * Get 是否漏洞节点 
     * @return IsWeDetect 是否漏洞节点
     */
    public Boolean getIsWeDetect() {
        return this.IsWeDetect;
    }

    /**
     * Set 是否漏洞节点
     * @param IsWeDetect 是否漏洞节点
     */
    public void setIsWeDetect(Boolean IsWeDetect) {
        this.IsWeDetect = IsWeDetect;
    }

    /**
     * Get 是否告警节点 
     * @return IsAlarm 是否告警节点
     */
    public Boolean getIsAlarm() {
        return this.IsAlarm;
    }

    /**
     * Set 是否告警节点
     * @param IsAlarm 是否告警节点
     */
    public void setIsAlarm(Boolean IsAlarm) {
        this.IsAlarm = IsAlarm;
    }

    /**
     * Get 文件路径md5，当Type=3时使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilePathMd5 文件路径md5，当Type=3时使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFilePathMd5() {
        return this.FilePathMd5;
    }

    /**
     * Set 文件路径md5，当Type=3时使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilePathMd5 文件路径md5，当Type=3时使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilePathMd5(String FilePathMd5) {
        this.FilePathMd5 = FilePathMd5;
    }

    /**
     * Get 请求目的地址md5，当Type=2时使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddressMd5 请求目的地址md5，当Type=2时使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddressMd5() {
        return this.AddressMd5;
    }

    /**
     * Set 请求目的地址md5，当Type=2时使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddressMd5 请求目的地址md5，当Type=2时使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddressMd5(String AddressMd5) {
        this.AddressMd5 = AddressMd5;
    }

    public VertexInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VertexInfo(VertexInfo source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Vid != null) {
            this.Vid = new String(source.Vid);
        }
        if (source.ParentVid != null) {
            this.ParentVid = new String(source.ParentVid);
        }
        if (source.IsLeaf != null) {
            this.IsLeaf = new Boolean(source.IsLeaf);
        }
        if (source.ProcNamePrefix != null) {
            this.ProcNamePrefix = new String(source.ProcNamePrefix);
        }
        if (source.ProcNameMd5 != null) {
            this.ProcNameMd5 = new String(source.ProcNameMd5);
        }
        if (source.CmdLinePrefix != null) {
            this.CmdLinePrefix = new String(source.CmdLinePrefix);
        }
        if (source.CmdLineMd5 != null) {
            this.CmdLineMd5 = new String(source.CmdLineMd5);
        }
        if (source.FilePathPrefix != null) {
            this.FilePathPrefix = new String(source.FilePathPrefix);
        }
        if (source.AddressPrefix != null) {
            this.AddressPrefix = new String(source.AddressPrefix);
        }
        if (source.IsWeDetect != null) {
            this.IsWeDetect = new Boolean(source.IsWeDetect);
        }
        if (source.IsAlarm != null) {
            this.IsAlarm = new Boolean(source.IsAlarm);
        }
        if (source.FilePathMd5 != null) {
            this.FilePathMd5 = new String(source.FilePathMd5);
        }
        if (source.AddressMd5 != null) {
            this.AddressMd5 = new String(source.AddressMd5);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Vid", this.Vid);
        this.setParamSimple(map, prefix + "ParentVid", this.ParentVid);
        this.setParamSimple(map, prefix + "IsLeaf", this.IsLeaf);
        this.setParamSimple(map, prefix + "ProcNamePrefix", this.ProcNamePrefix);
        this.setParamSimple(map, prefix + "ProcNameMd5", this.ProcNameMd5);
        this.setParamSimple(map, prefix + "CmdLinePrefix", this.CmdLinePrefix);
        this.setParamSimple(map, prefix + "CmdLineMd5", this.CmdLineMd5);
        this.setParamSimple(map, prefix + "FilePathPrefix", this.FilePathPrefix);
        this.setParamSimple(map, prefix + "AddressPrefix", this.AddressPrefix);
        this.setParamSimple(map, prefix + "IsWeDetect", this.IsWeDetect);
        this.setParamSimple(map, prefix + "IsAlarm", this.IsAlarm);
        this.setParamSimple(map, prefix + "FilePathMd5", this.FilePathMd5);
        this.setParamSimple(map, prefix + "AddressMd5", this.AddressMd5);

    }
}

