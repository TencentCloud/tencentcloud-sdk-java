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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUpgradeInstanceCheckResponse extends AbstractModel {

    /**
    * 本变配是否对实例有影响，0-没有影响 1-有影响
    */
    @SerializedName("IsAffect")
    @Expose
    private Long IsAffect;

    /**
    * 本变配是否可以执行 0-不通过，不能变配 1-通过，可以变配
    */
    @SerializedName("Passed")
    @Expose
    private Long Passed;

    /**
    * 本变配是升配还是降配，down-降配 up-升配
    */
    @SerializedName("ModifyMode")
    @Expose
    private String ModifyMode;

    /**
    * 检查项列表
    */
    @SerializedName("CheckItems")
    @Expose
    private CheckItem [] CheckItems;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 本变配是否对实例有影响，0-没有影响 1-有影响 
     * @return IsAffect 本变配是否对实例有影响，0-没有影响 1-有影响
     */
    public Long getIsAffect() {
        return this.IsAffect;
    }

    /**
     * Set 本变配是否对实例有影响，0-没有影响 1-有影响
     * @param IsAffect 本变配是否对实例有影响，0-没有影响 1-有影响
     */
    public void setIsAffect(Long IsAffect) {
        this.IsAffect = IsAffect;
    }

    /**
     * Get 本变配是否可以执行 0-不通过，不能变配 1-通过，可以变配 
     * @return Passed 本变配是否可以执行 0-不通过，不能变配 1-通过，可以变配
     */
    public Long getPassed() {
        return this.Passed;
    }

    /**
     * Set 本变配是否可以执行 0-不通过，不能变配 1-通过，可以变配
     * @param Passed 本变配是否可以执行 0-不通过，不能变配 1-通过，可以变配
     */
    public void setPassed(Long Passed) {
        this.Passed = Passed;
    }

    /**
     * Get 本变配是升配还是降配，down-降配 up-升配 
     * @return ModifyMode 本变配是升配还是降配，down-降配 up-升配
     */
    public String getModifyMode() {
        return this.ModifyMode;
    }

    /**
     * Set 本变配是升配还是降配，down-降配 up-升配
     * @param ModifyMode 本变配是升配还是降配，down-降配 up-升配
     */
    public void setModifyMode(String ModifyMode) {
        this.ModifyMode = ModifyMode;
    }

    /**
     * Get 检查项列表 
     * @return CheckItems 检查项列表
     */
    public CheckItem [] getCheckItems() {
        return this.CheckItems;
    }

    /**
     * Set 检查项列表
     * @param CheckItems 检查项列表
     */
    public void setCheckItems(CheckItem [] CheckItems) {
        this.CheckItems = CheckItems;
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

    public DescribeUpgradeInstanceCheckResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUpgradeInstanceCheckResponse(DescribeUpgradeInstanceCheckResponse source) {
        if (source.IsAffect != null) {
            this.IsAffect = new Long(source.IsAffect);
        }
        if (source.Passed != null) {
            this.Passed = new Long(source.Passed);
        }
        if (source.ModifyMode != null) {
            this.ModifyMode = new String(source.ModifyMode);
        }
        if (source.CheckItems != null) {
            this.CheckItems = new CheckItem[source.CheckItems.length];
            for (int i = 0; i < source.CheckItems.length; i++) {
                this.CheckItems[i] = new CheckItem(source.CheckItems[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsAffect", this.IsAffect);
        this.setParamSimple(map, prefix + "Passed", this.Passed);
        this.setParamSimple(map, prefix + "ModifyMode", this.ModifyMode);
        this.setParamArrayObj(map, prefix + "CheckItems.", this.CheckItems);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

