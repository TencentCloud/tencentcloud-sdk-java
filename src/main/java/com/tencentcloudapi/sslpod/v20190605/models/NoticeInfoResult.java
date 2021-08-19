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
package com.tencentcloudapi.sslpod.v20190605.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NoticeInfoResult extends AbstractModel{

    /**
    * 通知ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 通知开关信息；0：关闭；15开启
    */
    @SerializedName("NoticeType")
    @Expose
    private Long NoticeType;

    /**
    * 额度信息
    */
    @SerializedName("LimitInfos")
    @Expose
    private LimitInfo [] LimitInfos;

    /**
     * Get 通知ID 
     * @return Id 通知ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 通知ID
     * @param Id 通知ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 通知开关信息；0：关闭；15开启 
     * @return NoticeType 通知开关信息；0：关闭；15开启
     */
    public Long getNoticeType() {
        return this.NoticeType;
    }

    /**
     * Set 通知开关信息；0：关闭；15开启
     * @param NoticeType 通知开关信息；0：关闭；15开启
     */
    public void setNoticeType(Long NoticeType) {
        this.NoticeType = NoticeType;
    }

    /**
     * Get 额度信息 
     * @return LimitInfos 额度信息
     */
    public LimitInfo [] getLimitInfos() {
        return this.LimitInfos;
    }

    /**
     * Set 额度信息
     * @param LimitInfos 额度信息
     */
    public void setLimitInfos(LimitInfo [] LimitInfos) {
        this.LimitInfos = LimitInfos;
    }

    public NoticeInfoResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NoticeInfoResult(NoticeInfoResult source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.NoticeType != null) {
            this.NoticeType = new Long(source.NoticeType);
        }
        if (source.LimitInfos != null) {
            this.LimitInfos = new LimitInfo[source.LimitInfos.length];
            for (int i = 0; i < source.LimitInfos.length; i++) {
                this.LimitInfos[i] = new LimitInfo(source.LimitInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "NoticeType", this.NoticeType);
        this.setParamArrayObj(map, prefix + "LimitInfos.", this.LimitInfos);

    }
}

