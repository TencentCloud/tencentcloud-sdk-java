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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupProIspDataInfo extends AbstractModel{

    /**
    * 省份。
    */
    @SerializedName("ProvinceName")
    @Expose
    private String ProvinceName;

    /**
    * 运营商。
    */
    @SerializedName("IspName")
    @Expose
    private String IspName;

    /**
    * 分钟维度的明细数据。
    */
    @SerializedName("DetailInfoList")
    @Expose
    private CdnPlayStatData [] DetailInfoList;

    /**
     * Get 省份。 
     * @return ProvinceName 省份。
     */
    public String getProvinceName() {
        return this.ProvinceName;
    }

    /**
     * Set 省份。
     * @param ProvinceName 省份。
     */
    public void setProvinceName(String ProvinceName) {
        this.ProvinceName = ProvinceName;
    }

    /**
     * Get 运营商。 
     * @return IspName 运营商。
     */
    public String getIspName() {
        return this.IspName;
    }

    /**
     * Set 运营商。
     * @param IspName 运营商。
     */
    public void setIspName(String IspName) {
        this.IspName = IspName;
    }

    /**
     * Get 分钟维度的明细数据。 
     * @return DetailInfoList 分钟维度的明细数据。
     */
    public CdnPlayStatData [] getDetailInfoList() {
        return this.DetailInfoList;
    }

    /**
     * Set 分钟维度的明细数据。
     * @param DetailInfoList 分钟维度的明细数据。
     */
    public void setDetailInfoList(CdnPlayStatData [] DetailInfoList) {
        this.DetailInfoList = DetailInfoList;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProvinceName", this.ProvinceName);
        this.setParamSimple(map, prefix + "IspName", this.IspName);
        this.setParamArrayObj(map, prefix + "DetailInfoList.", this.DetailInfoList);

    }
}

