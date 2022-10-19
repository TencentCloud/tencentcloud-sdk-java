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
package com.tencentcloudapi.captcha.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RequestTrendObj extends AbstractModel{

    /**
    * 时间参数
    */
    @SerializedName("Ftime")
    @Expose
    private String Ftime;

    /**
    * 请求量
    */
    @SerializedName("RequestAction")
    @Expose
    private Long RequestAction;

    /**
    * 验证量
    */
    @SerializedName("RequestVerify")
    @Expose
    private Long RequestVerify;

    /**
    * 通过量
    */
    @SerializedName("RequestThroughput")
    @Expose
    private Long RequestThroughput;

    /**
    * 拦截量
    */
    @SerializedName("RequestIntercept")
    @Expose
    private Long RequestIntercept;

    /**
     * Get 时间参数 
     * @return Ftime 时间参数
     */
    public String getFtime() {
        return this.Ftime;
    }

    /**
     * Set 时间参数
     * @param Ftime 时间参数
     */
    public void setFtime(String Ftime) {
        this.Ftime = Ftime;
    }

    /**
     * Get 请求量 
     * @return RequestAction 请求量
     */
    public Long getRequestAction() {
        return this.RequestAction;
    }

    /**
     * Set 请求量
     * @param RequestAction 请求量
     */
    public void setRequestAction(Long RequestAction) {
        this.RequestAction = RequestAction;
    }

    /**
     * Get 验证量 
     * @return RequestVerify 验证量
     */
    public Long getRequestVerify() {
        return this.RequestVerify;
    }

    /**
     * Set 验证量
     * @param RequestVerify 验证量
     */
    public void setRequestVerify(Long RequestVerify) {
        this.RequestVerify = RequestVerify;
    }

    /**
     * Get 通过量 
     * @return RequestThroughput 通过量
     */
    public Long getRequestThroughput() {
        return this.RequestThroughput;
    }

    /**
     * Set 通过量
     * @param RequestThroughput 通过量
     */
    public void setRequestThroughput(Long RequestThroughput) {
        this.RequestThroughput = RequestThroughput;
    }

    /**
     * Get 拦截量 
     * @return RequestIntercept 拦截量
     */
    public Long getRequestIntercept() {
        return this.RequestIntercept;
    }

    /**
     * Set 拦截量
     * @param RequestIntercept 拦截量
     */
    public void setRequestIntercept(Long RequestIntercept) {
        this.RequestIntercept = RequestIntercept;
    }

    public RequestTrendObj() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RequestTrendObj(RequestTrendObj source) {
        if (source.Ftime != null) {
            this.Ftime = new String(source.Ftime);
        }
        if (source.RequestAction != null) {
            this.RequestAction = new Long(source.RequestAction);
        }
        if (source.RequestVerify != null) {
            this.RequestVerify = new Long(source.RequestVerify);
        }
        if (source.RequestThroughput != null) {
            this.RequestThroughput = new Long(source.RequestThroughput);
        }
        if (source.RequestIntercept != null) {
            this.RequestIntercept = new Long(source.RequestIntercept);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ftime", this.Ftime);
        this.setParamSimple(map, prefix + "RequestAction", this.RequestAction);
        this.setParamSimple(map, prefix + "RequestVerify", this.RequestVerify);
        this.setParamSimple(map, prefix + "RequestThroughput", this.RequestThroughput);
        this.setParamSimple(map, prefix + "RequestIntercept", this.RequestIntercept);

    }
}

