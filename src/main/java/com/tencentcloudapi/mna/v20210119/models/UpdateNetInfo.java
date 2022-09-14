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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateNetInfo extends AbstractModel{

    /**
    * 网络类型：
0:数据
1:Wi-Fi
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 启用/禁用
    */
    @SerializedName("DataEnable")
    @Expose
    private Boolean DataEnable;

    /**
    * 上行限速：bit
    */
    @SerializedName("UploadLimit")
    @Expose
    private Long UploadLimit;

    /**
    * 下行限速：bit
    */
    @SerializedName("DownloadLimit")
    @Expose
    private Long DownloadLimit;

    /**
    * 网卡名
    */
    @SerializedName("NetInfoName")
    @Expose
    private String NetInfoName;

    /**
     * Get 网络类型：
0:数据
1:Wi-Fi 
     * @return Type 网络类型：
0:数据
1:Wi-Fi
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 网络类型：
0:数据
1:Wi-Fi
     * @param Type 网络类型：
0:数据
1:Wi-Fi
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 启用/禁用 
     * @return DataEnable 启用/禁用
     */
    public Boolean getDataEnable() {
        return this.DataEnable;
    }

    /**
     * Set 启用/禁用
     * @param DataEnable 启用/禁用
     */
    public void setDataEnable(Boolean DataEnable) {
        this.DataEnable = DataEnable;
    }

    /**
     * Get 上行限速：bit 
     * @return UploadLimit 上行限速：bit
     */
    public Long getUploadLimit() {
        return this.UploadLimit;
    }

    /**
     * Set 上行限速：bit
     * @param UploadLimit 上行限速：bit
     */
    public void setUploadLimit(Long UploadLimit) {
        this.UploadLimit = UploadLimit;
    }

    /**
     * Get 下行限速：bit 
     * @return DownloadLimit 下行限速：bit
     */
    public Long getDownloadLimit() {
        return this.DownloadLimit;
    }

    /**
     * Set 下行限速：bit
     * @param DownloadLimit 下行限速：bit
     */
    public void setDownloadLimit(Long DownloadLimit) {
        this.DownloadLimit = DownloadLimit;
    }

    /**
     * Get 网卡名 
     * @return NetInfoName 网卡名
     */
    public String getNetInfoName() {
        return this.NetInfoName;
    }

    /**
     * Set 网卡名
     * @param NetInfoName 网卡名
     */
    public void setNetInfoName(String NetInfoName) {
        this.NetInfoName = NetInfoName;
    }

    public UpdateNetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateNetInfo(UpdateNetInfo source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.DataEnable != null) {
            this.DataEnable = new Boolean(source.DataEnable);
        }
        if (source.UploadLimit != null) {
            this.UploadLimit = new Long(source.UploadLimit);
        }
        if (source.DownloadLimit != null) {
            this.DownloadLimit = new Long(source.DownloadLimit);
        }
        if (source.NetInfoName != null) {
            this.NetInfoName = new String(source.NetInfoName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "DataEnable", this.DataEnable);
        this.setParamSimple(map, prefix + "UploadLimit", this.UploadLimit);
        this.setParamSimple(map, prefix + "DownloadLimit", this.DownloadLimit);
        this.setParamSimple(map, prefix + "NetInfoName", this.NetInfoName);

    }
}

