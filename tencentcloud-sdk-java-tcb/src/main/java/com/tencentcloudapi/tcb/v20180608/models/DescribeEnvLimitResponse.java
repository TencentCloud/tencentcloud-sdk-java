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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEnvLimitResponse extends AbstractModel{

    /**
    * 环境总数上限
    */
    @SerializedName("MaxEnvNum")
    @Expose
    private Long MaxEnvNum;

    /**
    * 目前环境总数
    */
    @SerializedName("CurrentEnvNum")
    @Expose
    private Long CurrentEnvNum;

    /**
    * 免费环境数量上限
    */
    @SerializedName("MaxFreeEnvNum")
    @Expose
    private Long MaxFreeEnvNum;

    /**
    * 目前免费环境数量
    */
    @SerializedName("CurrentFreeEnvNum")
    @Expose
    private Long CurrentFreeEnvNum;

    /**
    * 总计允许销毁环境次数上限
    */
    @SerializedName("MaxDeleteTotal")
    @Expose
    private Long MaxDeleteTotal;

    /**
    * 目前已销毁环境次数
    */
    @SerializedName("CurrentDeleteTotal")
    @Expose
    private Long CurrentDeleteTotal;

    /**
    * 每月允许销毁环境次数上限
    */
    @SerializedName("MaxDeleteMonthly")
    @Expose
    private Long MaxDeleteMonthly;

    /**
    * 本月已销毁环境次数
    */
    @SerializedName("CurrentDeleteMonthly")
    @Expose
    private Long CurrentDeleteMonthly;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 环境总数上限 
     * @return MaxEnvNum 环境总数上限
     */
    public Long getMaxEnvNum() {
        return this.MaxEnvNum;
    }

    /**
     * Set 环境总数上限
     * @param MaxEnvNum 环境总数上限
     */
    public void setMaxEnvNum(Long MaxEnvNum) {
        this.MaxEnvNum = MaxEnvNum;
    }

    /**
     * Get 目前环境总数 
     * @return CurrentEnvNum 目前环境总数
     */
    public Long getCurrentEnvNum() {
        return this.CurrentEnvNum;
    }

    /**
     * Set 目前环境总数
     * @param CurrentEnvNum 目前环境总数
     */
    public void setCurrentEnvNum(Long CurrentEnvNum) {
        this.CurrentEnvNum = CurrentEnvNum;
    }

    /**
     * Get 免费环境数量上限 
     * @return MaxFreeEnvNum 免费环境数量上限
     */
    public Long getMaxFreeEnvNum() {
        return this.MaxFreeEnvNum;
    }

    /**
     * Set 免费环境数量上限
     * @param MaxFreeEnvNum 免费环境数量上限
     */
    public void setMaxFreeEnvNum(Long MaxFreeEnvNum) {
        this.MaxFreeEnvNum = MaxFreeEnvNum;
    }

    /**
     * Get 目前免费环境数量 
     * @return CurrentFreeEnvNum 目前免费环境数量
     */
    public Long getCurrentFreeEnvNum() {
        return this.CurrentFreeEnvNum;
    }

    /**
     * Set 目前免费环境数量
     * @param CurrentFreeEnvNum 目前免费环境数量
     */
    public void setCurrentFreeEnvNum(Long CurrentFreeEnvNum) {
        this.CurrentFreeEnvNum = CurrentFreeEnvNum;
    }

    /**
     * Get 总计允许销毁环境次数上限 
     * @return MaxDeleteTotal 总计允许销毁环境次数上限
     */
    public Long getMaxDeleteTotal() {
        return this.MaxDeleteTotal;
    }

    /**
     * Set 总计允许销毁环境次数上限
     * @param MaxDeleteTotal 总计允许销毁环境次数上限
     */
    public void setMaxDeleteTotal(Long MaxDeleteTotal) {
        this.MaxDeleteTotal = MaxDeleteTotal;
    }

    /**
     * Get 目前已销毁环境次数 
     * @return CurrentDeleteTotal 目前已销毁环境次数
     */
    public Long getCurrentDeleteTotal() {
        return this.CurrentDeleteTotal;
    }

    /**
     * Set 目前已销毁环境次数
     * @param CurrentDeleteTotal 目前已销毁环境次数
     */
    public void setCurrentDeleteTotal(Long CurrentDeleteTotal) {
        this.CurrentDeleteTotal = CurrentDeleteTotal;
    }

    /**
     * Get 每月允许销毁环境次数上限 
     * @return MaxDeleteMonthly 每月允许销毁环境次数上限
     */
    public Long getMaxDeleteMonthly() {
        return this.MaxDeleteMonthly;
    }

    /**
     * Set 每月允许销毁环境次数上限
     * @param MaxDeleteMonthly 每月允许销毁环境次数上限
     */
    public void setMaxDeleteMonthly(Long MaxDeleteMonthly) {
        this.MaxDeleteMonthly = MaxDeleteMonthly;
    }

    /**
     * Get 本月已销毁环境次数 
     * @return CurrentDeleteMonthly 本月已销毁环境次数
     */
    public Long getCurrentDeleteMonthly() {
        return this.CurrentDeleteMonthly;
    }

    /**
     * Set 本月已销毁环境次数
     * @param CurrentDeleteMonthly 本月已销毁环境次数
     */
    public void setCurrentDeleteMonthly(Long CurrentDeleteMonthly) {
        this.CurrentDeleteMonthly = CurrentDeleteMonthly;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxEnvNum", this.MaxEnvNum);
        this.setParamSimple(map, prefix + "CurrentEnvNum", this.CurrentEnvNum);
        this.setParamSimple(map, prefix + "MaxFreeEnvNum", this.MaxFreeEnvNum);
        this.setParamSimple(map, prefix + "CurrentFreeEnvNum", this.CurrentFreeEnvNum);
        this.setParamSimple(map, prefix + "MaxDeleteTotal", this.MaxDeleteTotal);
        this.setParamSimple(map, prefix + "CurrentDeleteTotal", this.CurrentDeleteTotal);
        this.setParamSimple(map, prefix + "MaxDeleteMonthly", this.MaxDeleteMonthly);
        this.setParamSimple(map, prefix + "CurrentDeleteMonthly", this.CurrentDeleteMonthly);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

