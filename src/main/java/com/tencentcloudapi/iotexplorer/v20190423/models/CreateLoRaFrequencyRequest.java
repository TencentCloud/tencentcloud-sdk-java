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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLoRaFrequencyRequest extends AbstractModel{

    /**
    * 频点配置名称
    */
    @SerializedName("FreqName")
    @Expose
    private String FreqName;

    /**
    * 数据上行信道
    */
    @SerializedName("ChannelsDataUp")
    @Expose
    private Long [] ChannelsDataUp;

    /**
    * 数据下行RX1信道
    */
    @SerializedName("ChannelsDataRX1")
    @Expose
    private Long [] ChannelsDataRX1;

    /**
    * 数据下行RX2信道
    */
    @SerializedName("ChannelsDataRX2")
    @Expose
    private Long [] ChannelsDataRX2;

    /**
    * 入网上行信道
    */
    @SerializedName("ChannelsJoinUp")
    @Expose
    private Long [] ChannelsJoinUp;

    /**
    * 入网下行RX1信道
    */
    @SerializedName("ChannelsJoinRX1")
    @Expose
    private Long [] ChannelsJoinRX1;

    /**
    * 入网下行RX2信道
    */
    @SerializedName("ChannelsJoinRX2")
    @Expose
    private Long [] ChannelsJoinRX2;

    /**
    * 频点配置描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 频点配置名称 
     * @return FreqName 频点配置名称
     */
    public String getFreqName() {
        return this.FreqName;
    }

    /**
     * Set 频点配置名称
     * @param FreqName 频点配置名称
     */
    public void setFreqName(String FreqName) {
        this.FreqName = FreqName;
    }

    /**
     * Get 数据上行信道 
     * @return ChannelsDataUp 数据上行信道
     */
    public Long [] getChannelsDataUp() {
        return this.ChannelsDataUp;
    }

    /**
     * Set 数据上行信道
     * @param ChannelsDataUp 数据上行信道
     */
    public void setChannelsDataUp(Long [] ChannelsDataUp) {
        this.ChannelsDataUp = ChannelsDataUp;
    }

    /**
     * Get 数据下行RX1信道 
     * @return ChannelsDataRX1 数据下行RX1信道
     */
    public Long [] getChannelsDataRX1() {
        return this.ChannelsDataRX1;
    }

    /**
     * Set 数据下行RX1信道
     * @param ChannelsDataRX1 数据下行RX1信道
     */
    public void setChannelsDataRX1(Long [] ChannelsDataRX1) {
        this.ChannelsDataRX1 = ChannelsDataRX1;
    }

    /**
     * Get 数据下行RX2信道 
     * @return ChannelsDataRX2 数据下行RX2信道
     */
    public Long [] getChannelsDataRX2() {
        return this.ChannelsDataRX2;
    }

    /**
     * Set 数据下行RX2信道
     * @param ChannelsDataRX2 数据下行RX2信道
     */
    public void setChannelsDataRX2(Long [] ChannelsDataRX2) {
        this.ChannelsDataRX2 = ChannelsDataRX2;
    }

    /**
     * Get 入网上行信道 
     * @return ChannelsJoinUp 入网上行信道
     */
    public Long [] getChannelsJoinUp() {
        return this.ChannelsJoinUp;
    }

    /**
     * Set 入网上行信道
     * @param ChannelsJoinUp 入网上行信道
     */
    public void setChannelsJoinUp(Long [] ChannelsJoinUp) {
        this.ChannelsJoinUp = ChannelsJoinUp;
    }

    /**
     * Get 入网下行RX1信道 
     * @return ChannelsJoinRX1 入网下行RX1信道
     */
    public Long [] getChannelsJoinRX1() {
        return this.ChannelsJoinRX1;
    }

    /**
     * Set 入网下行RX1信道
     * @param ChannelsJoinRX1 入网下行RX1信道
     */
    public void setChannelsJoinRX1(Long [] ChannelsJoinRX1) {
        this.ChannelsJoinRX1 = ChannelsJoinRX1;
    }

    /**
     * Get 入网下行RX2信道 
     * @return ChannelsJoinRX2 入网下行RX2信道
     */
    public Long [] getChannelsJoinRX2() {
        return this.ChannelsJoinRX2;
    }

    /**
     * Set 入网下行RX2信道
     * @param ChannelsJoinRX2 入网下行RX2信道
     */
    public void setChannelsJoinRX2(Long [] ChannelsJoinRX2) {
        this.ChannelsJoinRX2 = ChannelsJoinRX2;
    }

    /**
     * Get 频点配置描述 
     * @return Description 频点配置描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 频点配置描述
     * @param Description 频点配置描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateLoRaFrequencyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLoRaFrequencyRequest(CreateLoRaFrequencyRequest source) {
        if (source.FreqName != null) {
            this.FreqName = new String(source.FreqName);
        }
        if (source.ChannelsDataUp != null) {
            this.ChannelsDataUp = new Long[source.ChannelsDataUp.length];
            for (int i = 0; i < source.ChannelsDataUp.length; i++) {
                this.ChannelsDataUp[i] = new Long(source.ChannelsDataUp[i]);
            }
        }
        if (source.ChannelsDataRX1 != null) {
            this.ChannelsDataRX1 = new Long[source.ChannelsDataRX1.length];
            for (int i = 0; i < source.ChannelsDataRX1.length; i++) {
                this.ChannelsDataRX1[i] = new Long(source.ChannelsDataRX1[i]);
            }
        }
        if (source.ChannelsDataRX2 != null) {
            this.ChannelsDataRX2 = new Long[source.ChannelsDataRX2.length];
            for (int i = 0; i < source.ChannelsDataRX2.length; i++) {
                this.ChannelsDataRX2[i] = new Long(source.ChannelsDataRX2[i]);
            }
        }
        if (source.ChannelsJoinUp != null) {
            this.ChannelsJoinUp = new Long[source.ChannelsJoinUp.length];
            for (int i = 0; i < source.ChannelsJoinUp.length; i++) {
                this.ChannelsJoinUp[i] = new Long(source.ChannelsJoinUp[i]);
            }
        }
        if (source.ChannelsJoinRX1 != null) {
            this.ChannelsJoinRX1 = new Long[source.ChannelsJoinRX1.length];
            for (int i = 0; i < source.ChannelsJoinRX1.length; i++) {
                this.ChannelsJoinRX1[i] = new Long(source.ChannelsJoinRX1[i]);
            }
        }
        if (source.ChannelsJoinRX2 != null) {
            this.ChannelsJoinRX2 = new Long[source.ChannelsJoinRX2.length];
            for (int i = 0; i < source.ChannelsJoinRX2.length; i++) {
                this.ChannelsJoinRX2[i] = new Long(source.ChannelsJoinRX2[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FreqName", this.FreqName);
        this.setParamArraySimple(map, prefix + "ChannelsDataUp.", this.ChannelsDataUp);
        this.setParamArraySimple(map, prefix + "ChannelsDataRX1.", this.ChannelsDataRX1);
        this.setParamArraySimple(map, prefix + "ChannelsDataRX2.", this.ChannelsDataRX2);
        this.setParamArraySimple(map, prefix + "ChannelsJoinUp.", this.ChannelsJoinUp);
        this.setParamArraySimple(map, prefix + "ChannelsJoinRX1.", this.ChannelsJoinRX1);
        this.setParamArraySimple(map, prefix + "ChannelsJoinRX2.", this.ChannelsJoinRX2);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

