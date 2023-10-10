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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScreenProtectionStatResponse extends AbstractModel{

    /**
    * 文件查杀 status:  0:从未检测过，或0资产付费情况, 1:已检测，存在恶意文件, 2:已检测，未开启隔离防护, 3:已检测且已开启防护且无风险
暴力破解status: 0:未开启防护或0付费资产情况 1:已开启防护 2:存在带处理事件
漏洞扫描status: 0:从未检测过，或0资产付费情况, 1:存在漏洞风险, 2:无风险
基线检测status: 0:从未检测过，或0资产付费情况, 1:存在基线风险,2:无风险
    */
    @SerializedName("Info")
    @Expose
    private ScreenProtection [] Info;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 文件查杀 status:  0:从未检测过，或0资产付费情况, 1:已检测，存在恶意文件, 2:已检测，未开启隔离防护, 3:已检测且已开启防护且无风险
暴力破解status: 0:未开启防护或0付费资产情况 1:已开启防护 2:存在带处理事件
漏洞扫描status: 0:从未检测过，或0资产付费情况, 1:存在漏洞风险, 2:无风险
基线检测status: 0:从未检测过，或0资产付费情况, 1:存在基线风险,2:无风险 
     * @return Info 文件查杀 status:  0:从未检测过，或0资产付费情况, 1:已检测，存在恶意文件, 2:已检测，未开启隔离防护, 3:已检测且已开启防护且无风险
暴力破解status: 0:未开启防护或0付费资产情况 1:已开启防护 2:存在带处理事件
漏洞扫描status: 0:从未检测过，或0资产付费情况, 1:存在漏洞风险, 2:无风险
基线检测status: 0:从未检测过，或0资产付费情况, 1:存在基线风险,2:无风险
     */
    public ScreenProtection [] getInfo() {
        return this.Info;
    }

    /**
     * Set 文件查杀 status:  0:从未检测过，或0资产付费情况, 1:已检测，存在恶意文件, 2:已检测，未开启隔离防护, 3:已检测且已开启防护且无风险
暴力破解status: 0:未开启防护或0付费资产情况 1:已开启防护 2:存在带处理事件
漏洞扫描status: 0:从未检测过，或0资产付费情况, 1:存在漏洞风险, 2:无风险
基线检测status: 0:从未检测过，或0资产付费情况, 1:存在基线风险,2:无风险
     * @param Info 文件查杀 status:  0:从未检测过，或0资产付费情况, 1:已检测，存在恶意文件, 2:已检测，未开启隔离防护, 3:已检测且已开启防护且无风险
暴力破解status: 0:未开启防护或0付费资产情况 1:已开启防护 2:存在带处理事件
漏洞扫描status: 0:从未检测过，或0资产付费情况, 1:存在漏洞风险, 2:无风险
基线检测status: 0:从未检测过，或0资产付费情况, 1:存在基线风险,2:无风险
     */
    public void setInfo(ScreenProtection [] Info) {
        this.Info = Info;
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

    public DescribeScreenProtectionStatResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScreenProtectionStatResponse(DescribeScreenProtectionStatResponse source) {
        if (source.Info != null) {
            this.Info = new ScreenProtection[source.Info.length];
            for (int i = 0; i < source.Info.length; i++) {
                this.Info[i] = new ScreenProtection(source.Info[i]);
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
        this.setParamArrayObj(map, prefix + "Info.", this.Info);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

