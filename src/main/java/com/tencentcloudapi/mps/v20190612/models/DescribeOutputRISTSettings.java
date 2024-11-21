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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOutputRISTSettings extends AbstractModel {

    /**
    * RIST模式，可选[LISTENER|CALLER]，默认为LISTENER。
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * RIST配置方案，可选[MAIN|SIMPLE]，默认为MAIN。
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
    * RIST缓冲区大小，单位为毫秒。最小值为50毫秒，最大值为5000毫秒。默认值：120
    */
    @SerializedName("Buffer")
    @Expose
    private Long Buffer;

    /**
    * 服务器监听地址，RIST模式为LISTENER时使用。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceAddresses")
    @Expose
    private OutputRISTSourceAddressResp [] SourceAddresses;

    /**
     * Get RIST模式，可选[LISTENER|CALLER]，默认为LISTENER。 
     * @return Mode RIST模式，可选[LISTENER|CALLER]，默认为LISTENER。
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set RIST模式，可选[LISTENER|CALLER]，默认为LISTENER。
     * @param Mode RIST模式，可选[LISTENER|CALLER]，默认为LISTENER。
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get RIST配置方案，可选[MAIN|SIMPLE]，默认为MAIN。 
     * @return Profile RIST配置方案，可选[MAIN|SIMPLE]，默认为MAIN。
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set RIST配置方案，可选[MAIN|SIMPLE]，默认为MAIN。
     * @param Profile RIST配置方案，可选[MAIN|SIMPLE]，默认为MAIN。
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    /**
     * Get RIST缓冲区大小，单位为毫秒。最小值为50毫秒，最大值为5000毫秒。默认值：120 
     * @return Buffer RIST缓冲区大小，单位为毫秒。最小值为50毫秒，最大值为5000毫秒。默认值：120
     */
    public Long getBuffer() {
        return this.Buffer;
    }

    /**
     * Set RIST缓冲区大小，单位为毫秒。最小值为50毫秒，最大值为5000毫秒。默认值：120
     * @param Buffer RIST缓冲区大小，单位为毫秒。最小值为50毫秒，最大值为5000毫秒。默认值：120
     */
    public void setBuffer(Long Buffer) {
        this.Buffer = Buffer;
    }

    /**
     * Get 服务器监听地址，RIST模式为LISTENER时使用。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceAddresses 服务器监听地址，RIST模式为LISTENER时使用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OutputRISTSourceAddressResp [] getSourceAddresses() {
        return this.SourceAddresses;
    }

    /**
     * Set 服务器监听地址，RIST模式为LISTENER时使用。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceAddresses 服务器监听地址，RIST模式为LISTENER时使用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceAddresses(OutputRISTSourceAddressResp [] SourceAddresses) {
        this.SourceAddresses = SourceAddresses;
    }

    public DescribeOutputRISTSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOutputRISTSettings(DescribeOutputRISTSettings source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
        if (source.Buffer != null) {
            this.Buffer = new Long(source.Buffer);
        }
        if (source.SourceAddresses != null) {
            this.SourceAddresses = new OutputRISTSourceAddressResp[source.SourceAddresses.length];
            for (int i = 0; i < source.SourceAddresses.length; i++) {
                this.SourceAddresses[i] = new OutputRISTSourceAddressResp(source.SourceAddresses[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Profile", this.Profile);
        this.setParamSimple(map, prefix + "Buffer", this.Buffer);
        this.setParamArrayObj(map, prefix + "SourceAddresses.", this.SourceAddresses);

    }
}

