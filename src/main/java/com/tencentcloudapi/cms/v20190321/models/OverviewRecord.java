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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OverviewRecord  extends AbstractModel{

    /**
    * 调用恶意量
    */
    @SerializedName("EvilCount")
    @Expose
    private Long EvilCount;

    /**
    * Text表示文本，Image表示图片，Audio表示音频，Video表示视频
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 调用总量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 恶意量同比增长率
    */
    @SerializedName("Yoy")
    @Expose
    private String Yoy;

    /**
     * 获取调用恶意量
     * @return EvilCount 调用恶意量
     */
    public Long getEvilCount() {
        return this.EvilCount;
    }

    /**
     * 设置调用恶意量
     * @param EvilCount 调用恶意量
     */
    public void setEvilCount(Long EvilCount) {
        this.EvilCount = EvilCount;
    }

    /**
     * 获取Text表示文本，Image表示图片，Audio表示音频，Video表示视频
     * @return ServiceType Text表示文本，Image表示图片，Audio表示音频，Video表示视频
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * 设置Text表示文本，Image表示图片，Audio表示音频，Video表示视频
     * @param ServiceType Text表示文本，Image表示图片，Audio表示音频，Video表示视频
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * 获取调用总量
     * @return TotalCount 调用总量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置调用总量
     * @param TotalCount 调用总量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取恶意量同比增长率
     * @return Yoy 恶意量同比增长率
     */
    public String getYoy() {
        return this.Yoy;
    }

    /**
     * 设置恶意量同比增长率
     * @param Yoy 恶意量同比增长率
     */
    public void setYoy(String Yoy) {
        this.Yoy = Yoy;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EvilCount", this.EvilCount);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "Yoy", this.Yoy);

    }
}

