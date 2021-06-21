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

public class ProtectThresholdRelation extends AbstractModel{

    /**
    * DDoS防护等级，取值[
low(宽松)
middle(适中)
high(严格)
]
    */
    @SerializedName("DDoSLevel")
    @Expose
    private String DDoSLevel;

    /**
    * DDoS清洗阈值，单位Mbps
    */
    @SerializedName("DDoSThreshold")
    @Expose
    private Long DDoSThreshold;

    /**
    * DDoS的AI防护开关，取值[
on(开启)
off(关闭)
]
    */
    @SerializedName("DDoSAI")
    @Expose
    private String DDoSAI;

    /**
    * CC清洗开关，取值[
0(关闭)
1(开启)
]
    */
    @SerializedName("CCEnable")
    @Expose
    private Long CCEnable;

    /**
    * CC清洗阈值，单位QPS
    */
    @SerializedName("CCThreshold")
    @Expose
    private Long CCThreshold;

    /**
    * 所属的资源实例
    */
    @SerializedName("InstanceDetailList")
    @Expose
    private InstanceRelation [] InstanceDetailList;

    /**
    * 域名与协议纬度的防护阈值
    */
    @SerializedName("ListenerCcThresholdList")
    @Expose
    private ListenerCcThreholdConfig [] ListenerCcThresholdList;

    /**
     * Get DDoS防护等级，取值[
low(宽松)
middle(适中)
high(严格)
] 
     * @return DDoSLevel DDoS防护等级，取值[
low(宽松)
middle(适中)
high(严格)
]
     */
    public String getDDoSLevel() {
        return this.DDoSLevel;
    }

    /**
     * Set DDoS防护等级，取值[
low(宽松)
middle(适中)
high(严格)
]
     * @param DDoSLevel DDoS防护等级，取值[
low(宽松)
middle(适中)
high(严格)
]
     */
    public void setDDoSLevel(String DDoSLevel) {
        this.DDoSLevel = DDoSLevel;
    }

    /**
     * Get DDoS清洗阈值，单位Mbps 
     * @return DDoSThreshold DDoS清洗阈值，单位Mbps
     */
    public Long getDDoSThreshold() {
        return this.DDoSThreshold;
    }

    /**
     * Set DDoS清洗阈值，单位Mbps
     * @param DDoSThreshold DDoS清洗阈值，单位Mbps
     */
    public void setDDoSThreshold(Long DDoSThreshold) {
        this.DDoSThreshold = DDoSThreshold;
    }

    /**
     * Get DDoS的AI防护开关，取值[
on(开启)
off(关闭)
] 
     * @return DDoSAI DDoS的AI防护开关，取值[
on(开启)
off(关闭)
]
     */
    public String getDDoSAI() {
        return this.DDoSAI;
    }

    /**
     * Set DDoS的AI防护开关，取值[
on(开启)
off(关闭)
]
     * @param DDoSAI DDoS的AI防护开关，取值[
on(开启)
off(关闭)
]
     */
    public void setDDoSAI(String DDoSAI) {
        this.DDoSAI = DDoSAI;
    }

    /**
     * Get CC清洗开关，取值[
0(关闭)
1(开启)
] 
     * @return CCEnable CC清洗开关，取值[
0(关闭)
1(开启)
]
     */
    public Long getCCEnable() {
        return this.CCEnable;
    }

    /**
     * Set CC清洗开关，取值[
0(关闭)
1(开启)
]
     * @param CCEnable CC清洗开关，取值[
0(关闭)
1(开启)
]
     */
    public void setCCEnable(Long CCEnable) {
        this.CCEnable = CCEnable;
    }

    /**
     * Get CC清洗阈值，单位QPS 
     * @return CCThreshold CC清洗阈值，单位QPS
     */
    public Long getCCThreshold() {
        return this.CCThreshold;
    }

    /**
     * Set CC清洗阈值，单位QPS
     * @param CCThreshold CC清洗阈值，单位QPS
     */
    public void setCCThreshold(Long CCThreshold) {
        this.CCThreshold = CCThreshold;
    }

    /**
     * Get 所属的资源实例 
     * @return InstanceDetailList 所属的资源实例
     */
    public InstanceRelation [] getInstanceDetailList() {
        return this.InstanceDetailList;
    }

    /**
     * Set 所属的资源实例
     * @param InstanceDetailList 所属的资源实例
     */
    public void setInstanceDetailList(InstanceRelation [] InstanceDetailList) {
        this.InstanceDetailList = InstanceDetailList;
    }

    /**
     * Get 域名与协议纬度的防护阈值 
     * @return ListenerCcThresholdList 域名与协议纬度的防护阈值
     */
    public ListenerCcThreholdConfig [] getListenerCcThresholdList() {
        return this.ListenerCcThresholdList;
    }

    /**
     * Set 域名与协议纬度的防护阈值
     * @param ListenerCcThresholdList 域名与协议纬度的防护阈值
     */
    public void setListenerCcThresholdList(ListenerCcThreholdConfig [] ListenerCcThresholdList) {
        this.ListenerCcThresholdList = ListenerCcThresholdList;
    }

    public ProtectThresholdRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtectThresholdRelation(ProtectThresholdRelation source) {
        if (source.DDoSLevel != null) {
            this.DDoSLevel = new String(source.DDoSLevel);
        }
        if (source.DDoSThreshold != null) {
            this.DDoSThreshold = new Long(source.DDoSThreshold);
        }
        if (source.DDoSAI != null) {
            this.DDoSAI = new String(source.DDoSAI);
        }
        if (source.CCEnable != null) {
            this.CCEnable = new Long(source.CCEnable);
        }
        if (source.CCThreshold != null) {
            this.CCThreshold = new Long(source.CCThreshold);
        }
        if (source.InstanceDetailList != null) {
            this.InstanceDetailList = new InstanceRelation[source.InstanceDetailList.length];
            for (int i = 0; i < source.InstanceDetailList.length; i++) {
                this.InstanceDetailList[i] = new InstanceRelation(source.InstanceDetailList[i]);
            }
        }
        if (source.ListenerCcThresholdList != null) {
            this.ListenerCcThresholdList = new ListenerCcThreholdConfig[source.ListenerCcThresholdList.length];
            for (int i = 0; i < source.ListenerCcThresholdList.length; i++) {
                this.ListenerCcThresholdList[i] = new ListenerCcThreholdConfig(source.ListenerCcThresholdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DDoSLevel", this.DDoSLevel);
        this.setParamSimple(map, prefix + "DDoSThreshold", this.DDoSThreshold);
        this.setParamSimple(map, prefix + "DDoSAI", this.DDoSAI);
        this.setParamSimple(map, prefix + "CCEnable", this.CCEnable);
        this.setParamSimple(map, prefix + "CCThreshold", this.CCThreshold);
        this.setParamArrayObj(map, prefix + "InstanceDetailList.", this.InstanceDetailList);
        this.setParamArrayObj(map, prefix + "ListenerCcThresholdList.", this.ListenerCcThresholdList);

    }
}

