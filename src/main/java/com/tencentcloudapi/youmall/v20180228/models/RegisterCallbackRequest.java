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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegisterCallbackRequest  extends AbstractModel{

    /**
    * 集团id，通过"指定身份标识获取客户门店列表"接口获取
    */
    @SerializedName("CompanyId")
    @Expose
    private String CompanyId;

    /**
    * 通知回调地址，完整url，示例（http://youmall.tencentcloudapi.com/）
    */
    @SerializedName("BackUrl")
    @Expose
    private String BackUrl;

    /**
    * 请求时间戳
    */
    @SerializedName("Time")
    @Expose
    private Integer Time;

    /**
    * 是否需要顾客图片，1-需要图片，其它-不需要图片
    */
    @SerializedName("NeedFacePic")
    @Expose
    private Integer NeedFacePic;

    /**
     * 获取集团id，通过"指定身份标识获取客户门店列表"接口获取
     * @return CompanyId 集团id，通过"指定身份标识获取客户门店列表"接口获取
     */
    public String getCompanyId() {
        return this.CompanyId;
    }

    /**
     * 设置集团id，通过"指定身份标识获取客户门店列表"接口获取
     * @param CompanyId 集团id，通过"指定身份标识获取客户门店列表"接口获取
     */
    public void setCompanyId(String CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * 获取通知回调地址，完整url，示例（http://youmall.tencentcloudapi.com/）
     * @return BackUrl 通知回调地址，完整url，示例（http://youmall.tencentcloudapi.com/）
     */
    public String getBackUrl() {
        return this.BackUrl;
    }

    /**
     * 设置通知回调地址，完整url，示例（http://youmall.tencentcloudapi.com/）
     * @param BackUrl 通知回调地址，完整url，示例（http://youmall.tencentcloudapi.com/）
     */
    public void setBackUrl(String BackUrl) {
        this.BackUrl = BackUrl;
    }

    /**
     * 获取请求时间戳
     * @return Time 请求时间戳
     */
    public Integer getTime() {
        return this.Time;
    }

    /**
     * 设置请求时间戳
     * @param Time 请求时间戳
     */
    public void setTime(Integer Time) {
        this.Time = Time;
    }

    /**
     * 获取是否需要顾客图片，1-需要图片，其它-不需要图片
     * @return NeedFacePic 是否需要顾客图片，1-需要图片，其它-不需要图片
     */
    public Integer getNeedFacePic() {
        return this.NeedFacePic;
    }

    /**
     * 设置是否需要顾客图片，1-需要图片，其它-不需要图片
     * @param NeedFacePic 是否需要顾客图片，1-需要图片，其它-不需要图片
     */
    public void setNeedFacePic(Integer NeedFacePic) {
        this.NeedFacePic = NeedFacePic;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "BackUrl", this.BackUrl);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "NeedFacePic", this.NeedFacePic);

    }
}

