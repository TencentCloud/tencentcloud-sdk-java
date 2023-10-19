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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMachineDefenseCntResponse extends AbstractModel {

    /**
    * 攻击检测统计
    */
    @SerializedName("AttackLogs")
    @Expose
    private Long AttackLogs;

    /**
    * 核心文件监控统计
    */
    @SerializedName("FileTamper")
    @Expose
    private Long FileTamper;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 攻击检测统计 
     * @return AttackLogs 攻击检测统计
     */
    public Long getAttackLogs() {
        return this.AttackLogs;
    }

    /**
     * Set 攻击检测统计
     * @param AttackLogs 攻击检测统计
     */
    public void setAttackLogs(Long AttackLogs) {
        this.AttackLogs = AttackLogs;
    }

    /**
     * Get 核心文件监控统计 
     * @return FileTamper 核心文件监控统计
     */
    public Long getFileTamper() {
        return this.FileTamper;
    }

    /**
     * Set 核心文件监控统计
     * @param FileTamper 核心文件监控统计
     */
    public void setFileTamper(Long FileTamper) {
        this.FileTamper = FileTamper;
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

    public DescribeMachineDefenseCntResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMachineDefenseCntResponse(DescribeMachineDefenseCntResponse source) {
        if (source.AttackLogs != null) {
            this.AttackLogs = new Long(source.AttackLogs);
        }
        if (source.FileTamper != null) {
            this.FileTamper = new Long(source.FileTamper);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttackLogs", this.AttackLogs);
        this.setParamSimple(map, prefix + "FileTamper", this.FileTamper);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

