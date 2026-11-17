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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAigcWhitelistResponse extends AbstractModel {

    /**
    * <p>AIGC任务类型</p><p>枚举值：</p><ul><li>Image： AIGC 生图任务</li><li>Video： AIGC 生视频任务</li></ul>
    */
    @SerializedName("AigcType")
    @Expose
    private String AigcType;

    /**
    * <p>模型白名单开关</p><p>枚举值：</p><ul><li>ON： 打开，只有允许调用ModelWhitelist中列出的模型</li><li>OFF： 关闭，允许调用所有模型</li></ul>
    */
    @SerializedName("ModelWhitelistSwitch")
    @Expose
    private String ModelWhitelistSwitch;

    /**
    * <p>模型白名单列表</p>
    */
    @SerializedName("ModelWhitelist")
    @Expose
    private AigcWhitelistModel [] ModelWhitelist;

    /**
    * <p>IP白名单开关</p><p>枚举值：</p><ul><li>ON： 打开，只允许IpWhitelist中列出的IP段进行调用</li><li>OFF： 关闭，允许所有IP进行调用</li></ul>
    */
    @SerializedName("IpWhitelistSwitch")
    @Expose
    private String IpWhitelistSwitch;

    /**
    * <p>IP白名单的CIDR列表</p>
    */
    @SerializedName("IpWhitelist")
    @Expose
    private String [] IpWhitelist;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>AIGC任务类型</p><p>枚举值：</p><ul><li>Image： AIGC 生图任务</li><li>Video： AIGC 生视频任务</li></ul> 
     * @return AigcType <p>AIGC任务类型</p><p>枚举值：</p><ul><li>Image： AIGC 生图任务</li><li>Video： AIGC 生视频任务</li></ul>
     */
    public String getAigcType() {
        return this.AigcType;
    }

    /**
     * Set <p>AIGC任务类型</p><p>枚举值：</p><ul><li>Image： AIGC 生图任务</li><li>Video： AIGC 生视频任务</li></ul>
     * @param AigcType <p>AIGC任务类型</p><p>枚举值：</p><ul><li>Image： AIGC 生图任务</li><li>Video： AIGC 生视频任务</li></ul>
     */
    public void setAigcType(String AigcType) {
        this.AigcType = AigcType;
    }

    /**
     * Get <p>模型白名单开关</p><p>枚举值：</p><ul><li>ON： 打开，只有允许调用ModelWhitelist中列出的模型</li><li>OFF： 关闭，允许调用所有模型</li></ul> 
     * @return ModelWhitelistSwitch <p>模型白名单开关</p><p>枚举值：</p><ul><li>ON： 打开，只有允许调用ModelWhitelist中列出的模型</li><li>OFF： 关闭，允许调用所有模型</li></ul>
     */
    public String getModelWhitelistSwitch() {
        return this.ModelWhitelistSwitch;
    }

    /**
     * Set <p>模型白名单开关</p><p>枚举值：</p><ul><li>ON： 打开，只有允许调用ModelWhitelist中列出的模型</li><li>OFF： 关闭，允许调用所有模型</li></ul>
     * @param ModelWhitelistSwitch <p>模型白名单开关</p><p>枚举值：</p><ul><li>ON： 打开，只有允许调用ModelWhitelist中列出的模型</li><li>OFF： 关闭，允许调用所有模型</li></ul>
     */
    public void setModelWhitelistSwitch(String ModelWhitelistSwitch) {
        this.ModelWhitelistSwitch = ModelWhitelistSwitch;
    }

    /**
     * Get <p>模型白名单列表</p> 
     * @return ModelWhitelist <p>模型白名单列表</p>
     */
    public AigcWhitelistModel [] getModelWhitelist() {
        return this.ModelWhitelist;
    }

    /**
     * Set <p>模型白名单列表</p>
     * @param ModelWhitelist <p>模型白名单列表</p>
     */
    public void setModelWhitelist(AigcWhitelistModel [] ModelWhitelist) {
        this.ModelWhitelist = ModelWhitelist;
    }

    /**
     * Get <p>IP白名单开关</p><p>枚举值：</p><ul><li>ON： 打开，只允许IpWhitelist中列出的IP段进行调用</li><li>OFF： 关闭，允许所有IP进行调用</li></ul> 
     * @return IpWhitelistSwitch <p>IP白名单开关</p><p>枚举值：</p><ul><li>ON： 打开，只允许IpWhitelist中列出的IP段进行调用</li><li>OFF： 关闭，允许所有IP进行调用</li></ul>
     */
    public String getIpWhitelistSwitch() {
        return this.IpWhitelistSwitch;
    }

    /**
     * Set <p>IP白名单开关</p><p>枚举值：</p><ul><li>ON： 打开，只允许IpWhitelist中列出的IP段进行调用</li><li>OFF： 关闭，允许所有IP进行调用</li></ul>
     * @param IpWhitelistSwitch <p>IP白名单开关</p><p>枚举值：</p><ul><li>ON： 打开，只允许IpWhitelist中列出的IP段进行调用</li><li>OFF： 关闭，允许所有IP进行调用</li></ul>
     */
    public void setIpWhitelistSwitch(String IpWhitelistSwitch) {
        this.IpWhitelistSwitch = IpWhitelistSwitch;
    }

    /**
     * Get <p>IP白名单的CIDR列表</p> 
     * @return IpWhitelist <p>IP白名单的CIDR列表</p>
     */
    public String [] getIpWhitelist() {
        return this.IpWhitelist;
    }

    /**
     * Set <p>IP白名单的CIDR列表</p>
     * @param IpWhitelist <p>IP白名单的CIDR列表</p>
     */
    public void setIpWhitelist(String [] IpWhitelist) {
        this.IpWhitelist = IpWhitelist;
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

    public DescribeAigcWhitelistResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAigcWhitelistResponse(DescribeAigcWhitelistResponse source) {
        if (source.AigcType != null) {
            this.AigcType = new String(source.AigcType);
        }
        if (source.ModelWhitelistSwitch != null) {
            this.ModelWhitelistSwitch = new String(source.ModelWhitelistSwitch);
        }
        if (source.ModelWhitelist != null) {
            this.ModelWhitelist = new AigcWhitelistModel[source.ModelWhitelist.length];
            for (int i = 0; i < source.ModelWhitelist.length; i++) {
                this.ModelWhitelist[i] = new AigcWhitelistModel(source.ModelWhitelist[i]);
            }
        }
        if (source.IpWhitelistSwitch != null) {
            this.IpWhitelistSwitch = new String(source.IpWhitelistSwitch);
        }
        if (source.IpWhitelist != null) {
            this.IpWhitelist = new String[source.IpWhitelist.length];
            for (int i = 0; i < source.IpWhitelist.length; i++) {
                this.IpWhitelist[i] = new String(source.IpWhitelist[i]);
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
        this.setParamSimple(map, prefix + "AigcType", this.AigcType);
        this.setParamSimple(map, prefix + "ModelWhitelistSwitch", this.ModelWhitelistSwitch);
        this.setParamArrayObj(map, prefix + "ModelWhitelist.", this.ModelWhitelist);
        this.setParamSimple(map, prefix + "IpWhitelistSwitch", this.IpWhitelistSwitch);
        this.setParamArraySimple(map, prefix + "IpWhitelist.", this.IpWhitelist);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

