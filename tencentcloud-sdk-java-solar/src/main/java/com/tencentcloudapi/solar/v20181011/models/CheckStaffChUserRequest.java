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
package com.tencentcloudapi.solar.v20181011.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckStaffChUserRequest extends AbstractModel{

    /**
    * 员工ID
    */
    @SerializedName("UserId")
    @Expose
    private String [] UserId;

    /**
    * 渠道状态：checkpass审核通过, checkreject审核拒绝, enableoperate启用, stopoperate停用
    */
    @SerializedName("OperateType")
    @Expose
    private String OperateType;

    /**
     * Get 员工ID 
     * @return UserId 员工ID
     */
    public String [] getUserId() {
        return this.UserId;
    }

    /**
     * Set 员工ID
     * @param UserId 员工ID
     */
    public void setUserId(String [] UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 渠道状态：checkpass审核通过, checkreject审核拒绝, enableoperate启用, stopoperate停用 
     * @return OperateType 渠道状态：checkpass审核通过, checkreject审核拒绝, enableoperate启用, stopoperate停用
     */
    public String getOperateType() {
        return this.OperateType;
    }

    /**
     * Set 渠道状态：checkpass审核通过, checkreject审核拒绝, enableoperate启用, stopoperate停用
     * @param OperateType 渠道状态：checkpass审核通过, checkreject审核拒绝, enableoperate启用, stopoperate停用
     */
    public void setOperateType(String OperateType) {
        this.OperateType = OperateType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "UserId.", this.UserId);
        this.setParamSimple(map, prefix + "OperateType", this.OperateType);

    }
}

