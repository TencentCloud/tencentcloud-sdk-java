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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PolicyInfo extends AbstractModel {

    /**
    * 策略类型。取值：
1：文件重定向策略
2：剪切板重定向策略
3：外设重定向策略
4：水印策略
    */
    @SerializedName("PolicyType")
    @Expose
    private Long PolicyType;

    /**
    * 策略值。取值：
PolicyType对应个子取值范围：
	①：PolicyType为1-文件重定向策略	
					1：读写
					2：只读
					3：禁止读写
	②：剪切板重定向策略
					1：开启云桌面到客户端
					2：开启客户端到云桌面
					3：双向开启
					4：禁用
	③：外设重定向策略
					1：允许usb重定向
					2：允许端口重定向
					3：允许usb和端口重定向
					4：禁用
	④：水印策略
					4:   当前时间，居中策略
					10: 当前时间，平铺策略
					15:  云桌面ID， 居中策略
                                        16:  云桌面ID+当前时间， 居中策略
                                        17:  云桌面ID， 平铺策略
                                        18:  云桌面ID+当前时间， 平铺策略
    */
    @SerializedName("PolicyValue")
    @Expose
    private Long PolicyValue;

    /**
     * Get 策略类型。取值：
1：文件重定向策略
2：剪切板重定向策略
3：外设重定向策略
4：水印策略 
     * @return PolicyType 策略类型。取值：
1：文件重定向策略
2：剪切板重定向策略
3：外设重定向策略
4：水印策略
     */
    public Long getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 策略类型。取值：
1：文件重定向策略
2：剪切板重定向策略
3：外设重定向策略
4：水印策略
     * @param PolicyType 策略类型。取值：
1：文件重定向策略
2：剪切板重定向策略
3：外设重定向策略
4：水印策略
     */
    public void setPolicyType(Long PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get 策略值。取值：
PolicyType对应个子取值范围：
	①：PolicyType为1-文件重定向策略	
					1：读写
					2：只读
					3：禁止读写
	②：剪切板重定向策略
					1：开启云桌面到客户端
					2：开启客户端到云桌面
					3：双向开启
					4：禁用
	③：外设重定向策略
					1：允许usb重定向
					2：允许端口重定向
					3：允许usb和端口重定向
					4：禁用
	④：水印策略
					4:   当前时间，居中策略
					10: 当前时间，平铺策略
					15:  云桌面ID， 居中策略
                                        16:  云桌面ID+当前时间， 居中策略
                                        17:  云桌面ID， 平铺策略
                                        18:  云桌面ID+当前时间， 平铺策略 
     * @return PolicyValue 策略值。取值：
PolicyType对应个子取值范围：
	①：PolicyType为1-文件重定向策略	
					1：读写
					2：只读
					3：禁止读写
	②：剪切板重定向策略
					1：开启云桌面到客户端
					2：开启客户端到云桌面
					3：双向开启
					4：禁用
	③：外设重定向策略
					1：允许usb重定向
					2：允许端口重定向
					3：允许usb和端口重定向
					4：禁用
	④：水印策略
					4:   当前时间，居中策略
					10: 当前时间，平铺策略
					15:  云桌面ID， 居中策略
                                        16:  云桌面ID+当前时间， 居中策略
                                        17:  云桌面ID， 平铺策略
                                        18:  云桌面ID+当前时间， 平铺策略
     */
    public Long getPolicyValue() {
        return this.PolicyValue;
    }

    /**
     * Set 策略值。取值：
PolicyType对应个子取值范围：
	①：PolicyType为1-文件重定向策略	
					1：读写
					2：只读
					3：禁止读写
	②：剪切板重定向策略
					1：开启云桌面到客户端
					2：开启客户端到云桌面
					3：双向开启
					4：禁用
	③：外设重定向策略
					1：允许usb重定向
					2：允许端口重定向
					3：允许usb和端口重定向
					4：禁用
	④：水印策略
					4:   当前时间，居中策略
					10: 当前时间，平铺策略
					15:  云桌面ID， 居中策略
                                        16:  云桌面ID+当前时间， 居中策略
                                        17:  云桌面ID， 平铺策略
                                        18:  云桌面ID+当前时间， 平铺策略
     * @param PolicyValue 策略值。取值：
PolicyType对应个子取值范围：
	①：PolicyType为1-文件重定向策略	
					1：读写
					2：只读
					3：禁止读写
	②：剪切板重定向策略
					1：开启云桌面到客户端
					2：开启客户端到云桌面
					3：双向开启
					4：禁用
	③：外设重定向策略
					1：允许usb重定向
					2：允许端口重定向
					3：允许usb和端口重定向
					4：禁用
	④：水印策略
					4:   当前时间，居中策略
					10: 当前时间，平铺策略
					15:  云桌面ID， 居中策略
                                        16:  云桌面ID+当前时间， 居中策略
                                        17:  云桌面ID， 平铺策略
                                        18:  云桌面ID+当前时间， 平铺策略
     */
    public void setPolicyValue(Long PolicyValue) {
        this.PolicyValue = PolicyValue;
    }

    public PolicyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PolicyInfo(PolicyInfo source) {
        if (source.PolicyType != null) {
            this.PolicyType = new Long(source.PolicyType);
        }
        if (source.PolicyValue != null) {
            this.PolicyValue = new Long(source.PolicyValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "PolicyValue", this.PolicyValue);

    }
}

