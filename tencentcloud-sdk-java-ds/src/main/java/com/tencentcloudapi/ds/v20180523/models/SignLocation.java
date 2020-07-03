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
package com.tencentcloudapi.ds.v20180523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SignLocation extends AbstractModel{

    /**
    * 签名域页数
    */
    @SerializedName("SignOnPage")
    @Expose
    private String SignOnPage;

    /**
    * 签名域左下角X轴坐标轴
    */
    @SerializedName("SignLocationLBX")
    @Expose
    private String SignLocationLBX;

    /**
    * 签名域左下角Y轴坐标轴
    */
    @SerializedName("SignLocationLBY")
    @Expose
    private String SignLocationLBY;

    /**
    * 签名域右上角X轴坐标轴
    */
    @SerializedName("SignLocationRUX")
    @Expose
    private String SignLocationRUX;

    /**
    * 签名域右上角Y轴坐标轴
    */
    @SerializedName("SignLocationRUY")
    @Expose
    private String SignLocationRUY;

    /**
     * Get 签名域页数 
     * @return SignOnPage 签名域页数
     */
    public String getSignOnPage() {
        return this.SignOnPage;
    }

    /**
     * Set 签名域页数
     * @param SignOnPage 签名域页数
     */
    public void setSignOnPage(String SignOnPage) {
        this.SignOnPage = SignOnPage;
    }

    /**
     * Get 签名域左下角X轴坐标轴 
     * @return SignLocationLBX 签名域左下角X轴坐标轴
     */
    public String getSignLocationLBX() {
        return this.SignLocationLBX;
    }

    /**
     * Set 签名域左下角X轴坐标轴
     * @param SignLocationLBX 签名域左下角X轴坐标轴
     */
    public void setSignLocationLBX(String SignLocationLBX) {
        this.SignLocationLBX = SignLocationLBX;
    }

    /**
     * Get 签名域左下角Y轴坐标轴 
     * @return SignLocationLBY 签名域左下角Y轴坐标轴
     */
    public String getSignLocationLBY() {
        return this.SignLocationLBY;
    }

    /**
     * Set 签名域左下角Y轴坐标轴
     * @param SignLocationLBY 签名域左下角Y轴坐标轴
     */
    public void setSignLocationLBY(String SignLocationLBY) {
        this.SignLocationLBY = SignLocationLBY;
    }

    /**
     * Get 签名域右上角X轴坐标轴 
     * @return SignLocationRUX 签名域右上角X轴坐标轴
     */
    public String getSignLocationRUX() {
        return this.SignLocationRUX;
    }

    /**
     * Set 签名域右上角X轴坐标轴
     * @param SignLocationRUX 签名域右上角X轴坐标轴
     */
    public void setSignLocationRUX(String SignLocationRUX) {
        this.SignLocationRUX = SignLocationRUX;
    }

    /**
     * Get 签名域右上角Y轴坐标轴 
     * @return SignLocationRUY 签名域右上角Y轴坐标轴
     */
    public String getSignLocationRUY() {
        return this.SignLocationRUY;
    }

    /**
     * Set 签名域右上角Y轴坐标轴
     * @param SignLocationRUY 签名域右上角Y轴坐标轴
     */
    public void setSignLocationRUY(String SignLocationRUY) {
        this.SignLocationRUY = SignLocationRUY;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SignOnPage", this.SignOnPage);
        this.setParamSimple(map, prefix + "SignLocationLBX", this.SignLocationLBX);
        this.setParamSimple(map, prefix + "SignLocationLBY", this.SignLocationLBY);
        this.setParamSimple(map, prefix + "SignLocationRUX", this.SignLocationRUX);
        this.setParamSimple(map, prefix + "SignLocationRUY", this.SignLocationRUY);

    }
}

