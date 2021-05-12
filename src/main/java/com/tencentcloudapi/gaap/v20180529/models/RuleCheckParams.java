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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleCheckParams extends AbstractModel{

    /**
    * 健康检查的时间间隔
    */
    @SerializedName("DelayLoop")
    @Expose
    private Long DelayLoop;

    /**
    * 健康检查的响应超时时间
    */
    @SerializedName("ConnectTimeout")
    @Expose
    private Long ConnectTimeout;

    /**
    * 健康检查的检查路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 健康检查的方法，GET/HEAD
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 确认源站正常的返回码，可选范围[100, 200, 300, 400, 500]
    */
    @SerializedName("StatusCode")
    @Expose
    private Long [] StatusCode;

    /**
    * 健康检查的检查域名。
当调用ModifyRuleAttribute时，不支持修改该参数。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 源站服务失败统计频率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedCountInter")
    @Expose
    private Long FailedCountInter;

    /**
    * 源站健康性检查阀值，超过该阀值会屏蔽服务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedThreshold")
    @Expose
    private Long FailedThreshold;

    /**
    * 源站健康性检测超出阀值后，屏蔽的时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlockInter")
    @Expose
    private Long BlockInter;

    /**
     * Get 健康检查的时间间隔 
     * @return DelayLoop 健康检查的时间间隔
     */
    public Long getDelayLoop() {
        return this.DelayLoop;
    }

    /**
     * Set 健康检查的时间间隔
     * @param DelayLoop 健康检查的时间间隔
     */
    public void setDelayLoop(Long DelayLoop) {
        this.DelayLoop = DelayLoop;
    }

    /**
     * Get 健康检查的响应超时时间 
     * @return ConnectTimeout 健康检查的响应超时时间
     */
    public Long getConnectTimeout() {
        return this.ConnectTimeout;
    }

    /**
     * Set 健康检查的响应超时时间
     * @param ConnectTimeout 健康检查的响应超时时间
     */
    public void setConnectTimeout(Long ConnectTimeout) {
        this.ConnectTimeout = ConnectTimeout;
    }

    /**
     * Get 健康检查的检查路径 
     * @return Path 健康检查的检查路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 健康检查的检查路径
     * @param Path 健康检查的检查路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 健康检查的方法，GET/HEAD 
     * @return Method 健康检查的方法，GET/HEAD
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 健康检查的方法，GET/HEAD
     * @param Method 健康检查的方法，GET/HEAD
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 确认源站正常的返回码，可选范围[100, 200, 300, 400, 500] 
     * @return StatusCode 确认源站正常的返回码，可选范围[100, 200, 300, 400, 500]
     */
    public Long [] getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set 确认源站正常的返回码，可选范围[100, 200, 300, 400, 500]
     * @param StatusCode 确认源站正常的返回码，可选范围[100, 200, 300, 400, 500]
     */
    public void setStatusCode(Long [] StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get 健康检查的检查域名。
当调用ModifyRuleAttribute时，不支持修改该参数。 
     * @return Domain 健康检查的检查域名。
当调用ModifyRuleAttribute时，不支持修改该参数。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 健康检查的检查域名。
当调用ModifyRuleAttribute时，不支持修改该参数。
     * @param Domain 健康检查的检查域名。
当调用ModifyRuleAttribute时，不支持修改该参数。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 源站服务失败统计频率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedCountInter 源站服务失败统计频率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFailedCountInter() {
        return this.FailedCountInter;
    }

    /**
     * Set 源站服务失败统计频率
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedCountInter 源站服务失败统计频率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedCountInter(Long FailedCountInter) {
        this.FailedCountInter = FailedCountInter;
    }

    /**
     * Get 源站健康性检查阀值，超过该阀值会屏蔽服务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedThreshold 源站健康性检查阀值，超过该阀值会屏蔽服务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFailedThreshold() {
        return this.FailedThreshold;
    }

    /**
     * Set 源站健康性检查阀值，超过该阀值会屏蔽服务
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedThreshold 源站健康性检查阀值，超过该阀值会屏蔽服务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedThreshold(Long FailedThreshold) {
        this.FailedThreshold = FailedThreshold;
    }

    /**
     * Get 源站健康性检测超出阀值后，屏蔽的时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlockInter 源站健康性检测超出阀值后，屏蔽的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBlockInter() {
        return this.BlockInter;
    }

    /**
     * Set 源站健康性检测超出阀值后，屏蔽的时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlockInter 源站健康性检测超出阀值后，屏蔽的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlockInter(Long BlockInter) {
        this.BlockInter = BlockInter;
    }

    public RuleCheckParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleCheckParams(RuleCheckParams source) {
        if (source.DelayLoop != null) {
            this.DelayLoop = new Long(source.DelayLoop);
        }
        if (source.ConnectTimeout != null) {
            this.ConnectTimeout = new Long(source.ConnectTimeout);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.StatusCode != null) {
            this.StatusCode = new Long[source.StatusCode.length];
            for (int i = 0; i < source.StatusCode.length; i++) {
                this.StatusCode[i] = new Long(source.StatusCode[i]);
            }
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.FailedCountInter != null) {
            this.FailedCountInter = new Long(source.FailedCountInter);
        }
        if (source.FailedThreshold != null) {
            this.FailedThreshold = new Long(source.FailedThreshold);
        }
        if (source.BlockInter != null) {
            this.BlockInter = new Long(source.BlockInter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DelayLoop", this.DelayLoop);
        this.setParamSimple(map, prefix + "ConnectTimeout", this.ConnectTimeout);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamArraySimple(map, prefix + "StatusCode.", this.StatusCode);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "FailedCountInter", this.FailedCountInter);
        this.setParamSimple(map, prefix + "FailedThreshold", this.FailedThreshold);
        this.setParamSimple(map, prefix + "BlockInter", this.BlockInter);

    }
}

