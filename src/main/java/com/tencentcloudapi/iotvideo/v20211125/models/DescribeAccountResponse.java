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
package com.tencentcloudapi.iotvideo.v20211125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccountResponse extends AbstractModel{

    /**
    * 查询的账号id
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 1线上计费，2线下计费
    */
    @SerializedName("BillType")
    @Expose
    private Long BillType;

    /**
    * 0未定义，1按套餐预付费，2按量后付费
    */
    @SerializedName("BillMode")
    @Expose
    private Long BillMode;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 查询的账号id 
     * @return Uin 查询的账号id
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 查询的账号id
     * @param Uin 查询的账号id
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 1线上计费，2线下计费 
     * @return BillType 1线上计费，2线下计费
     */
    public Long getBillType() {
        return this.BillType;
    }

    /**
     * Set 1线上计费，2线下计费
     * @param BillType 1线上计费，2线下计费
     */
    public void setBillType(Long BillType) {
        this.BillType = BillType;
    }

    /**
     * Get 0未定义，1按套餐预付费，2按量后付费 
     * @return BillMode 0未定义，1按套餐预付费，2按量后付费
     */
    public Long getBillMode() {
        return this.BillMode;
    }

    /**
     * Set 0未定义，1按套餐预付费，2按量后付费
     * @param BillMode 0未定义，1按套餐预付费，2按量后付费
     */
    public void setBillMode(Long BillMode) {
        this.BillMode = BillMode;
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

    public DescribeAccountResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountResponse(DescribeAccountResponse source) {
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.BillType != null) {
            this.BillType = new Long(source.BillType);
        }
        if (source.BillMode != null) {
            this.BillMode = new Long(source.BillMode);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "BillType", this.BillType);
        this.setParamSimple(map, prefix + "BillMode", this.BillMode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

