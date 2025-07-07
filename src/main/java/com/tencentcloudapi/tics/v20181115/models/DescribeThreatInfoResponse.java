/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.tics.v20181115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeThreatInfoResponse extends AbstractModel {

    /**
    * 是否有数据，0代表有数据，1代表没有数据
    */
    @SerializedName("ReturnCode")
    @Expose
    private Long ReturnCode;

    /**
    * 判定结果，如：black、white、grey
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 置信度，取值0-100
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * 威胁类型。
botnet = 僵尸网络
trojan = 木马
ransomware = 勒索软件
worm = 蠕虫
dga = 域名生成算法
c2 = c&c
compromised = 失陷主机
dynamicIP = 动态IP
proxy = 代理
idc = idc 机房
whitelist = 白名单
tor = 暗网
miner = 挖矿
maleware site = 恶意站点
malware IP = 恶意IP
等等
    */
    @SerializedName("ThreatTypes")
    @Expose
    private String [] ThreatTypes;

    /**
    * 恶意标签，对应的团伙，家族等信息。
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 当前状态
active = 活跃
sinkholed = sinkholed
inactive = 不活跃
unknown = 未知
expired = 过期
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 情报相关的上下文，参数option=1 的时候提供
每个数据默认为3 条
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否有数据，0代表有数据，1代表没有数据 
     * @return ReturnCode 是否有数据，0代表有数据，1代表没有数据
     */
    public Long getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set 是否有数据，0代表有数据，1代表没有数据
     * @param ReturnCode 是否有数据，0代表有数据，1代表没有数据
     */
    public void setReturnCode(Long ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Get 判定结果，如：black、white、grey 
     * @return Result 判定结果，如：black、white、grey
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 判定结果，如：black、white、grey
     * @param Result 判定结果，如：black、white、grey
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 置信度，取值0-100 
     * @return Confidence 置信度，取值0-100
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 置信度，取值0-100
     * @param Confidence 置信度，取值0-100
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 威胁类型。
botnet = 僵尸网络
trojan = 木马
ransomware = 勒索软件
worm = 蠕虫
dga = 域名生成算法
c2 = c&c
compromised = 失陷主机
dynamicIP = 动态IP
proxy = 代理
idc = idc 机房
whitelist = 白名单
tor = 暗网
miner = 挖矿
maleware site = 恶意站点
malware IP = 恶意IP
等等 
     * @return ThreatTypes 威胁类型。
botnet = 僵尸网络
trojan = 木马
ransomware = 勒索软件
worm = 蠕虫
dga = 域名生成算法
c2 = c&c
compromised = 失陷主机
dynamicIP = 动态IP
proxy = 代理
idc = idc 机房
whitelist = 白名单
tor = 暗网
miner = 挖矿
maleware site = 恶意站点
malware IP = 恶意IP
等等
     */
    public String [] getThreatTypes() {
        return this.ThreatTypes;
    }

    /**
     * Set 威胁类型。
botnet = 僵尸网络
trojan = 木马
ransomware = 勒索软件
worm = 蠕虫
dga = 域名生成算法
c2 = c&c
compromised = 失陷主机
dynamicIP = 动态IP
proxy = 代理
idc = idc 机房
whitelist = 白名单
tor = 暗网
miner = 挖矿
maleware site = 恶意站点
malware IP = 恶意IP
等等
     * @param ThreatTypes 威胁类型。
botnet = 僵尸网络
trojan = 木马
ransomware = 勒索软件
worm = 蠕虫
dga = 域名生成算法
c2 = c&c
compromised = 失陷主机
dynamicIP = 动态IP
proxy = 代理
idc = idc 机房
whitelist = 白名单
tor = 暗网
miner = 挖矿
maleware site = 恶意站点
malware IP = 恶意IP
等等
     */
    public void setThreatTypes(String [] ThreatTypes) {
        this.ThreatTypes = ThreatTypes;
    }

    /**
     * Get 恶意标签，对应的团伙，家族等信息。 
     * @return Tags 恶意标签，对应的团伙，家族等信息。
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 恶意标签，对应的团伙，家族等信息。
     * @param Tags 恶意标签，对应的团伙，家族等信息。
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 当前状态
active = 活跃
sinkholed = sinkholed
inactive = 不活跃
unknown = 未知
expired = 过期 
     * @return Status 当前状态
active = 活跃
sinkholed = sinkholed
inactive = 不活跃
unknown = 未知
expired = 过期
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 当前状态
active = 活跃
sinkholed = sinkholed
inactive = 不活跃
unknown = 未知
expired = 过期
     * @param Status 当前状态
active = 活跃
sinkholed = sinkholed
inactive = 不活跃
unknown = 未知
expired = 过期
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 情报相关的上下文，参数option=1 的时候提供
每个数据默认为3 条 
     * @return Context 情报相关的上下文，参数option=1 的时候提供
每个数据默认为3 条
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 情报相关的上下文，参数option=1 的时候提供
每个数据默认为3 条
     * @param Context 情报相关的上下文，参数option=1 的时候提供
每个数据默认为3 条
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeThreatInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeThreatInfoResponse(DescribeThreatInfoResponse source) {
        if (source.ReturnCode != null) {
            this.ReturnCode = new Long(source.ReturnCode);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Confidence != null) {
            this.Confidence = new Long(source.Confidence);
        }
        if (source.ThreatTypes != null) {
            this.ThreatTypes = new String[source.ThreatTypes.length];
            for (int i = 0; i < source.ThreatTypes.length; i++) {
                this.ThreatTypes[i] = new String(source.ThreatTypes[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReturnCode", this.ReturnCode);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamArraySimple(map, prefix + "ThreatTypes.", this.ThreatTypes);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

