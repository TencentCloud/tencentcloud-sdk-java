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

public class LimitInfo extends AbstractModel{

    /**
    * 通知类型：
limit_emai：邮件
limit_wechat：微信
limit_phone：手机
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 总量
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 已发送
    */
    @SerializedName("Sent")
    @Expose
    private Long Sent;

    /**
     * Get 通知类型：
limit_emai：邮件
limit_wechat：微信
limit_phone：手机 
     * @return Type 通知类型：
limit_emai：邮件
limit_wechat：微信
limit_phone：手机
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 通知类型：
limit_emai：邮件
limit_wechat：微信
limit_phone：手机
     * @param Type 通知类型：
limit_emai：邮件
limit_wechat：微信
limit_phone：手机
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 总量 
     * @return Total 总量
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总量
     * @param Total 总量
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 已发送 
     * @return Sent 已发送
     */
    public Long getSent() {
        return this.Sent;
    }

    /**
     * Set 已发送
     * @param Sent 已发送
     */
    public void setSent(Long Sent) {
        this.Sent = Sent;
    }

    public LimitInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LimitInfo(LimitInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Sent != null) {
            this.Sent = new Long(source.Sent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Sent", this.Sent);

    }
}

