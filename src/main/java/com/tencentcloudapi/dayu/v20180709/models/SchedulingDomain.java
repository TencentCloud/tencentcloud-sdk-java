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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SchedulingDomain extends AbstractModel{

    /**
    * 调度域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * BGP线路IP列表
    */
    @SerializedName("BGPIpList")
    @Expose
    private String [] BGPIpList;

    /**
    * 电信线路IP列表
    */
    @SerializedName("CTCCIpList")
    @Expose
    private String [] CTCCIpList;

    /**
    * 联通线路IP列表
    */
    @SerializedName("CUCCIpList")
    @Expose
    private String [] CUCCIpList;

    /**
    * 移动线路IP列表
    */
    @SerializedName("CMCCIpList")
    @Expose
    private String [] CMCCIpList;

    /**
    * 海外线路IP列表
    */
    @SerializedName("OverseaIpList")
    @Expose
    private String [] OverseaIpList;

    /**
    * 调度方式，当前仅支持优先级, 取值为priority
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * ttl
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get 调度域名 
     * @return Domain 调度域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 调度域名
     * @param Domain 调度域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get BGP线路IP列表 
     * @return BGPIpList BGP线路IP列表
     */
    public String [] getBGPIpList() {
        return this.BGPIpList;
    }

    /**
     * Set BGP线路IP列表
     * @param BGPIpList BGP线路IP列表
     */
    public void setBGPIpList(String [] BGPIpList) {
        this.BGPIpList = BGPIpList;
    }

    /**
     * Get 电信线路IP列表 
     * @return CTCCIpList 电信线路IP列表
     */
    public String [] getCTCCIpList() {
        return this.CTCCIpList;
    }

    /**
     * Set 电信线路IP列表
     * @param CTCCIpList 电信线路IP列表
     */
    public void setCTCCIpList(String [] CTCCIpList) {
        this.CTCCIpList = CTCCIpList;
    }

    /**
     * Get 联通线路IP列表 
     * @return CUCCIpList 联通线路IP列表
     */
    public String [] getCUCCIpList() {
        return this.CUCCIpList;
    }

    /**
     * Set 联通线路IP列表
     * @param CUCCIpList 联通线路IP列表
     */
    public void setCUCCIpList(String [] CUCCIpList) {
        this.CUCCIpList = CUCCIpList;
    }

    /**
     * Get 移动线路IP列表 
     * @return CMCCIpList 移动线路IP列表
     */
    public String [] getCMCCIpList() {
        return this.CMCCIpList;
    }

    /**
     * Set 移动线路IP列表
     * @param CMCCIpList 移动线路IP列表
     */
    public void setCMCCIpList(String [] CMCCIpList) {
        this.CMCCIpList = CMCCIpList;
    }

    /**
     * Get 海外线路IP列表 
     * @return OverseaIpList 海外线路IP列表
     */
    public String [] getOverseaIpList() {
        return this.OverseaIpList;
    }

    /**
     * Set 海外线路IP列表
     * @param OverseaIpList 海外线路IP列表
     */
    public void setOverseaIpList(String [] OverseaIpList) {
        this.OverseaIpList = OverseaIpList;
    }

    /**
     * Get 调度方式，当前仅支持优先级, 取值为priority 
     * @return Method 调度方式，当前仅支持优先级, 取值为priority
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 调度方式，当前仅支持优先级, 取值为priority
     * @param Method 调度方式，当前仅支持优先级, 取值为priority
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get ttl 
     * @return TTL ttl
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set ttl
     * @param TTL ttl
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public SchedulingDomain() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SchedulingDomain(SchedulingDomain source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.BGPIpList != null) {
            this.BGPIpList = new String[source.BGPIpList.length];
            for (int i = 0; i < source.BGPIpList.length; i++) {
                this.BGPIpList[i] = new String(source.BGPIpList[i]);
            }
        }
        if (source.CTCCIpList != null) {
            this.CTCCIpList = new String[source.CTCCIpList.length];
            for (int i = 0; i < source.CTCCIpList.length; i++) {
                this.CTCCIpList[i] = new String(source.CTCCIpList[i]);
            }
        }
        if (source.CUCCIpList != null) {
            this.CUCCIpList = new String[source.CUCCIpList.length];
            for (int i = 0; i < source.CUCCIpList.length; i++) {
                this.CUCCIpList[i] = new String(source.CUCCIpList[i]);
            }
        }
        if (source.CMCCIpList != null) {
            this.CMCCIpList = new String[source.CMCCIpList.length];
            for (int i = 0; i < source.CMCCIpList.length; i++) {
                this.CMCCIpList[i] = new String(source.CMCCIpList[i]);
            }
        }
        if (source.OverseaIpList != null) {
            this.OverseaIpList = new String[source.OverseaIpList.length];
            for (int i = 0; i < source.OverseaIpList.length; i++) {
                this.OverseaIpList[i] = new String(source.OverseaIpList[i]);
            }
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "BGPIpList.", this.BGPIpList);
        this.setParamArraySimple(map, prefix + "CTCCIpList.", this.CTCCIpList);
        this.setParamArraySimple(map, prefix + "CUCCIpList.", this.CUCCIpList);
        this.setParamArraySimple(map, prefix + "CMCCIpList.", this.CMCCIpList);
        this.setParamArraySimple(map, prefix + "OverseaIpList.", this.OverseaIpList);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

