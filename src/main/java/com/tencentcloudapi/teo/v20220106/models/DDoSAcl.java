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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSAcl extends AbstractModel{

    /**
    * 目的端口end
    */
    @SerializedName("DportEnd")
    @Expose
    private Long DportEnd;

    /**
    * 目的端口start
    */
    @SerializedName("DportStart")
    @Expose
    private Long DportStart;

    /**
    * 源端口end
    */
    @SerializedName("SportEnd")
    @Expose
    private Long SportEnd;

    /**
    * 源端口start
    */
    @SerializedName("SportStart")
    @Expose
    private Long SportStart;

    /**
    * 协议 'tcp', 'udp', 'all'
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 动作  drop-丢弃,；transmit-放行； forward-继续防护
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 是否为系统配置 0-人工配置；1-系统配置
    */
    @SerializedName("Default")
    @Expose
    private Long Default;

    /**
     * Get 目的端口end 
     * @return DportEnd 目的端口end
     */
    public Long getDportEnd() {
        return this.DportEnd;
    }

    /**
     * Set 目的端口end
     * @param DportEnd 目的端口end
     */
    public void setDportEnd(Long DportEnd) {
        this.DportEnd = DportEnd;
    }

    /**
     * Get 目的端口start 
     * @return DportStart 目的端口start
     */
    public Long getDportStart() {
        return this.DportStart;
    }

    /**
     * Set 目的端口start
     * @param DportStart 目的端口start
     */
    public void setDportStart(Long DportStart) {
        this.DportStart = DportStart;
    }

    /**
     * Get 源端口end 
     * @return SportEnd 源端口end
     */
    public Long getSportEnd() {
        return this.SportEnd;
    }

    /**
     * Set 源端口end
     * @param SportEnd 源端口end
     */
    public void setSportEnd(Long SportEnd) {
        this.SportEnd = SportEnd;
    }

    /**
     * Get 源端口start 
     * @return SportStart 源端口start
     */
    public Long getSportStart() {
        return this.SportStart;
    }

    /**
     * Set 源端口start
     * @param SportStart 源端口start
     */
    public void setSportStart(Long SportStart) {
        this.SportStart = SportStart;
    }

    /**
     * Get 协议 'tcp', 'udp', 'all' 
     * @return Protocol 协议 'tcp', 'udp', 'all'
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议 'tcp', 'udp', 'all'
     * @param Protocol 协议 'tcp', 'udp', 'all'
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 动作  drop-丢弃,；transmit-放行； forward-继续防护 
     * @return Action 动作  drop-丢弃,；transmit-放行； forward-继续防护
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 动作  drop-丢弃,；transmit-放行； forward-继续防护
     * @param Action 动作  drop-丢弃,；transmit-放行； forward-继续防护
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 是否为系统配置 0-人工配置；1-系统配置 
     * @return Default 是否为系统配置 0-人工配置；1-系统配置
     */
    public Long getDefault() {
        return this.Default;
    }

    /**
     * Set 是否为系统配置 0-人工配置；1-系统配置
     * @param Default 是否为系统配置 0-人工配置；1-系统配置
     */
    public void setDefault(Long Default) {
        this.Default = Default;
    }

    public DDoSAcl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSAcl(DDoSAcl source) {
        if (source.DportEnd != null) {
            this.DportEnd = new Long(source.DportEnd);
        }
        if (source.DportStart != null) {
            this.DportStart = new Long(source.DportStart);
        }
        if (source.SportEnd != null) {
            this.SportEnd = new Long(source.SportEnd);
        }
        if (source.SportStart != null) {
            this.SportStart = new Long(source.SportStart);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Default != null) {
            this.Default = new Long(source.Default);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DportEnd", this.DportEnd);
        this.setParamSimple(map, prefix + "DportStart", this.DportStart);
        this.setParamSimple(map, prefix + "SportEnd", this.SportEnd);
        this.setParamSimple(map, prefix + "SportStart", this.SportStart);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Default", this.Default);

    }
}

