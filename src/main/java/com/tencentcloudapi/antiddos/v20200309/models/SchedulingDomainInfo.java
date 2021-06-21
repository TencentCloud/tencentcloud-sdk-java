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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SchedulingDomainInfo extends AbstractModel{

    /**
    * 调度域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 线路IP列表
    */
    @SerializedName("LineIPList")
    @Expose
    private IPLineInfo [] LineIPList;

    /**
    * 调度方式，当前仅支持优先级的方式，取值[priority]
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 调度域名解析记录的TTL值
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * 运行状态，取值[
0：未运行
1：运行中
2：运行异常
]
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 最后修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 域名名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsrDomainName")
    @Expose
    private String UsrDomainName;

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
     * Get 线路IP列表 
     * @return LineIPList 线路IP列表
     */
    public IPLineInfo [] getLineIPList() {
        return this.LineIPList;
    }

    /**
     * Set 线路IP列表
     * @param LineIPList 线路IP列表
     */
    public void setLineIPList(IPLineInfo [] LineIPList) {
        this.LineIPList = LineIPList;
    }

    /**
     * Get 调度方式，当前仅支持优先级的方式，取值[priority] 
     * @return Method 调度方式，当前仅支持优先级的方式，取值[priority]
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 调度方式，当前仅支持优先级的方式，取值[priority]
     * @param Method 调度方式，当前仅支持优先级的方式，取值[priority]
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 调度域名解析记录的TTL值 
     * @return TTL 调度域名解析记录的TTL值
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set 调度域名解析记录的TTL值
     * @param TTL 调度域名解析记录的TTL值
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get 运行状态，取值[
0：未运行
1：运行中
2：运行异常
] 
     * @return Status 运行状态，取值[
0：未运行
1：运行中
2：运行异常
]
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 运行状态，取值[
0：未运行
1：运行中
2：运行异常
]
     * @param Status 运行状态，取值[
0：未运行
1：运行中
2：运行异常
]
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间 
     * @return CreatedTime 创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
     * @param CreatedTime 创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 最后修改时间 
     * @return ModifyTime 最后修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 最后修改时间
     * @param ModifyTime 最后修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 域名名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsrDomainName 域名名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsrDomainName() {
        return this.UsrDomainName;
    }

    /**
     * Set 域名名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsrDomainName 域名名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsrDomainName(String UsrDomainName) {
        this.UsrDomainName = UsrDomainName;
    }

    public SchedulingDomainInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SchedulingDomainInfo(SchedulingDomainInfo source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.LineIPList != null) {
            this.LineIPList = new IPLineInfo[source.LineIPList.length];
            for (int i = 0; i < source.LineIPList.length; i++) {
                this.LineIPList[i] = new IPLineInfo(source.LineIPList[i]);
            }
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.UsrDomainName != null) {
            this.UsrDomainName = new String(source.UsrDomainName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArrayObj(map, prefix + "LineIPList.", this.LineIPList);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "UsrDomainName", this.UsrDomainName);

    }
}

