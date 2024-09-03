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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeServerlessStrategyResponse extends AbstractModel {

    /**
    * cpu负载为 0 时持续多久（秒）发起自动暂停
    */
    @SerializedName("AutoPauseDelay")
    @Expose
    private Long AutoPauseDelay;

    /**
    * cpu负载超过当前规格核数时，持续多久（秒）发起自动扩容
    */
    @SerializedName("AutoScaleUpDelay")
    @Expose
    private Long AutoScaleUpDelay;

    /**
    * cpu 负载低于低一级规格核数时，持续多久（秒）发起自动缩容
    */
    @SerializedName("AutoScaleDownDelay")
    @Expose
    private Long AutoScaleDownDelay;

    /**
    * 是否自动暂停，可能值：
yes
no
    */
    @SerializedName("AutoPause")
    @Expose
    private String AutoPause;

    /**
    * 集群是否允许向上扩容，可选范围<li>yes</li><li>no</li>
    */
    @SerializedName("AutoScaleUp")
    @Expose
    private String AutoScaleUp;

    /**
    * 集群是否允许向下缩容，可选范围<li>yes</li><li>no</li>
    */
    @SerializedName("AutoScaleDown")
    @Expose
    private String AutoScaleDown;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get cpu负载为 0 时持续多久（秒）发起自动暂停 
     * @return AutoPauseDelay cpu负载为 0 时持续多久（秒）发起自动暂停
     */
    public Long getAutoPauseDelay() {
        return this.AutoPauseDelay;
    }

    /**
     * Set cpu负载为 0 时持续多久（秒）发起自动暂停
     * @param AutoPauseDelay cpu负载为 0 时持续多久（秒）发起自动暂停
     */
    public void setAutoPauseDelay(Long AutoPauseDelay) {
        this.AutoPauseDelay = AutoPauseDelay;
    }

    /**
     * Get cpu负载超过当前规格核数时，持续多久（秒）发起自动扩容 
     * @return AutoScaleUpDelay cpu负载超过当前规格核数时，持续多久（秒）发起自动扩容
     */
    public Long getAutoScaleUpDelay() {
        return this.AutoScaleUpDelay;
    }

    /**
     * Set cpu负载超过当前规格核数时，持续多久（秒）发起自动扩容
     * @param AutoScaleUpDelay cpu负载超过当前规格核数时，持续多久（秒）发起自动扩容
     */
    public void setAutoScaleUpDelay(Long AutoScaleUpDelay) {
        this.AutoScaleUpDelay = AutoScaleUpDelay;
    }

    /**
     * Get cpu 负载低于低一级规格核数时，持续多久（秒）发起自动缩容 
     * @return AutoScaleDownDelay cpu 负载低于低一级规格核数时，持续多久（秒）发起自动缩容
     */
    public Long getAutoScaleDownDelay() {
        return this.AutoScaleDownDelay;
    }

    /**
     * Set cpu 负载低于低一级规格核数时，持续多久（秒）发起自动缩容
     * @param AutoScaleDownDelay cpu 负载低于低一级规格核数时，持续多久（秒）发起自动缩容
     */
    public void setAutoScaleDownDelay(Long AutoScaleDownDelay) {
        this.AutoScaleDownDelay = AutoScaleDownDelay;
    }

    /**
     * Get 是否自动暂停，可能值：
yes
no 
     * @return AutoPause 是否自动暂停，可能值：
yes
no
     */
    public String getAutoPause() {
        return this.AutoPause;
    }

    /**
     * Set 是否自动暂停，可能值：
yes
no
     * @param AutoPause 是否自动暂停，可能值：
yes
no
     */
    public void setAutoPause(String AutoPause) {
        this.AutoPause = AutoPause;
    }

    /**
     * Get 集群是否允许向上扩容，可选范围<li>yes</li><li>no</li> 
     * @return AutoScaleUp 集群是否允许向上扩容，可选范围<li>yes</li><li>no</li>
     */
    public String getAutoScaleUp() {
        return this.AutoScaleUp;
    }

    /**
     * Set 集群是否允许向上扩容，可选范围<li>yes</li><li>no</li>
     * @param AutoScaleUp 集群是否允许向上扩容，可选范围<li>yes</li><li>no</li>
     */
    public void setAutoScaleUp(String AutoScaleUp) {
        this.AutoScaleUp = AutoScaleUp;
    }

    /**
     * Get 集群是否允许向下缩容，可选范围<li>yes</li><li>no</li> 
     * @return AutoScaleDown 集群是否允许向下缩容，可选范围<li>yes</li><li>no</li>
     */
    public String getAutoScaleDown() {
        return this.AutoScaleDown;
    }

    /**
     * Set 集群是否允许向下缩容，可选范围<li>yes</li><li>no</li>
     * @param AutoScaleDown 集群是否允许向下缩容，可选范围<li>yes</li><li>no</li>
     */
    public void setAutoScaleDown(String AutoScaleDown) {
        this.AutoScaleDown = AutoScaleDown;
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

    public DescribeServerlessStrategyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeServerlessStrategyResponse(DescribeServerlessStrategyResponse source) {
        if (source.AutoPauseDelay != null) {
            this.AutoPauseDelay = new Long(source.AutoPauseDelay);
        }
        if (source.AutoScaleUpDelay != null) {
            this.AutoScaleUpDelay = new Long(source.AutoScaleUpDelay);
        }
        if (source.AutoScaleDownDelay != null) {
            this.AutoScaleDownDelay = new Long(source.AutoScaleDownDelay);
        }
        if (source.AutoPause != null) {
            this.AutoPause = new String(source.AutoPause);
        }
        if (source.AutoScaleUp != null) {
            this.AutoScaleUp = new String(source.AutoScaleUp);
        }
        if (source.AutoScaleDown != null) {
            this.AutoScaleDown = new String(source.AutoScaleDown);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoPauseDelay", this.AutoPauseDelay);
        this.setParamSimple(map, prefix + "AutoScaleUpDelay", this.AutoScaleUpDelay);
        this.setParamSimple(map, prefix + "AutoScaleDownDelay", this.AutoScaleDownDelay);
        this.setParamSimple(map, prefix + "AutoPause", this.AutoPause);
        this.setParamSimple(map, prefix + "AutoScaleUp", this.AutoScaleUp);
        this.setParamSimple(map, prefix + "AutoScaleDown", this.AutoScaleDown);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

