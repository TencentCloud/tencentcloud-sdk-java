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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetTotalDurationResponse extends AbstractModel {

    /**
    * 语音:min
    */
    @SerializedName("Voice")
    @Expose
    private Long Voice;

    /**
    * 标清:min
    */
    @SerializedName("SD")
    @Expose
    private Long SD;

    /**
    * 高清:min
    */
    @SerializedName("HD")
    @Expose
    private Long HD;

    /**
    * 超高清:min
    */
    @SerializedName("FHD")
    @Expose
    private Long FHD;

    /**
    * 2k:min
    */
    @SerializedName("TwoK")
    @Expose
    private Long TwoK;

    /**
    * 4k:min
    */
    @SerializedName("FourK")
    @Expose
    private Long FourK;

    /**
    * 在线时长:min 
    */
    @SerializedName("Online")
    @Expose
    private Long Online;

    /**
    * 多网标清:min
    */
    @SerializedName("MultiSD")
    @Expose
    private Long MultiSD;

    /**
    * 多网高清:min
    */
    @SerializedName("MultiHD")
    @Expose
    private Long MultiHD;

    /**
    * 多网超高清:min
    */
    @SerializedName("MultiFHD")
    @Expose
    private Long MultiFHD;

    /**
    * 多网2k:min
    */
    @SerializedName("MultiTwoK")
    @Expose
    private Long MultiTwoK;

    /**
    * 多网4k:min
    */
    @SerializedName("MultiFourK")
    @Expose
    private Long MultiFourK;

    /**
    * 多网在线时长:min 
    */
    @SerializedName("MultiOnline")
    @Expose
    private Long MultiOnline;

    /**
    * 总抵扣时长:min 
    */
    @SerializedName("DeductDuration")
    @Expose
    private Long DeductDuration;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 语音:min 
     * @return Voice 语音:min
     */
    public Long getVoice() {
        return this.Voice;
    }

    /**
     * Set 语音:min
     * @param Voice 语音:min
     */
    public void setVoice(Long Voice) {
        this.Voice = Voice;
    }

    /**
     * Get 标清:min 
     * @return SD 标清:min
     */
    public Long getSD() {
        return this.SD;
    }

    /**
     * Set 标清:min
     * @param SD 标清:min
     */
    public void setSD(Long SD) {
        this.SD = SD;
    }

    /**
     * Get 高清:min 
     * @return HD 高清:min
     */
    public Long getHD() {
        return this.HD;
    }

    /**
     * Set 高清:min
     * @param HD 高清:min
     */
    public void setHD(Long HD) {
        this.HD = HD;
    }

    /**
     * Get 超高清:min 
     * @return FHD 超高清:min
     */
    public Long getFHD() {
        return this.FHD;
    }

    /**
     * Set 超高清:min
     * @param FHD 超高清:min
     */
    public void setFHD(Long FHD) {
        this.FHD = FHD;
    }

    /**
     * Get 2k:min 
     * @return TwoK 2k:min
     */
    public Long getTwoK() {
        return this.TwoK;
    }

    /**
     * Set 2k:min
     * @param TwoK 2k:min
     */
    public void setTwoK(Long TwoK) {
        this.TwoK = TwoK;
    }

    /**
     * Get 4k:min 
     * @return FourK 4k:min
     */
    public Long getFourK() {
        return this.FourK;
    }

    /**
     * Set 4k:min
     * @param FourK 4k:min
     */
    public void setFourK(Long FourK) {
        this.FourK = FourK;
    }

    /**
     * Get 在线时长:min  
     * @return Online 在线时长:min 
     */
    public Long getOnline() {
        return this.Online;
    }

    /**
     * Set 在线时长:min 
     * @param Online 在线时长:min 
     */
    public void setOnline(Long Online) {
        this.Online = Online;
    }

    /**
     * Get 多网标清:min 
     * @return MultiSD 多网标清:min
     */
    public Long getMultiSD() {
        return this.MultiSD;
    }

    /**
     * Set 多网标清:min
     * @param MultiSD 多网标清:min
     */
    public void setMultiSD(Long MultiSD) {
        this.MultiSD = MultiSD;
    }

    /**
     * Get 多网高清:min 
     * @return MultiHD 多网高清:min
     */
    public Long getMultiHD() {
        return this.MultiHD;
    }

    /**
     * Set 多网高清:min
     * @param MultiHD 多网高清:min
     */
    public void setMultiHD(Long MultiHD) {
        this.MultiHD = MultiHD;
    }

    /**
     * Get 多网超高清:min 
     * @return MultiFHD 多网超高清:min
     */
    public Long getMultiFHD() {
        return this.MultiFHD;
    }

    /**
     * Set 多网超高清:min
     * @param MultiFHD 多网超高清:min
     */
    public void setMultiFHD(Long MultiFHD) {
        this.MultiFHD = MultiFHD;
    }

    /**
     * Get 多网2k:min 
     * @return MultiTwoK 多网2k:min
     */
    public Long getMultiTwoK() {
        return this.MultiTwoK;
    }

    /**
     * Set 多网2k:min
     * @param MultiTwoK 多网2k:min
     */
    public void setMultiTwoK(Long MultiTwoK) {
        this.MultiTwoK = MultiTwoK;
    }

    /**
     * Get 多网4k:min 
     * @return MultiFourK 多网4k:min
     */
    public Long getMultiFourK() {
        return this.MultiFourK;
    }

    /**
     * Set 多网4k:min
     * @param MultiFourK 多网4k:min
     */
    public void setMultiFourK(Long MultiFourK) {
        this.MultiFourK = MultiFourK;
    }

    /**
     * Get 多网在线时长:min  
     * @return MultiOnline 多网在线时长:min 
     */
    public Long getMultiOnline() {
        return this.MultiOnline;
    }

    /**
     * Set 多网在线时长:min 
     * @param MultiOnline 多网在线时长:min 
     */
    public void setMultiOnline(Long MultiOnline) {
        this.MultiOnline = MultiOnline;
    }

    /**
     * Get 总抵扣时长:min  
     * @return DeductDuration 总抵扣时长:min 
     */
    public Long getDeductDuration() {
        return this.DeductDuration;
    }

    /**
     * Set 总抵扣时长:min 
     * @param DeductDuration 总抵扣时长:min 
     */
    public void setDeductDuration(Long DeductDuration) {
        this.DeductDuration = DeductDuration;
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

    public GetTotalDurationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetTotalDurationResponse(GetTotalDurationResponse source) {
        if (source.Voice != null) {
            this.Voice = new Long(source.Voice);
        }
        if (source.SD != null) {
            this.SD = new Long(source.SD);
        }
        if (source.HD != null) {
            this.HD = new Long(source.HD);
        }
        if (source.FHD != null) {
            this.FHD = new Long(source.FHD);
        }
        if (source.TwoK != null) {
            this.TwoK = new Long(source.TwoK);
        }
        if (source.FourK != null) {
            this.FourK = new Long(source.FourK);
        }
        if (source.Online != null) {
            this.Online = new Long(source.Online);
        }
        if (source.MultiSD != null) {
            this.MultiSD = new Long(source.MultiSD);
        }
        if (source.MultiHD != null) {
            this.MultiHD = new Long(source.MultiHD);
        }
        if (source.MultiFHD != null) {
            this.MultiFHD = new Long(source.MultiFHD);
        }
        if (source.MultiTwoK != null) {
            this.MultiTwoK = new Long(source.MultiTwoK);
        }
        if (source.MultiFourK != null) {
            this.MultiFourK = new Long(source.MultiFourK);
        }
        if (source.MultiOnline != null) {
            this.MultiOnline = new Long(source.MultiOnline);
        }
        if (source.DeductDuration != null) {
            this.DeductDuration = new Long(source.DeductDuration);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Voice", this.Voice);
        this.setParamSimple(map, prefix + "SD", this.SD);
        this.setParamSimple(map, prefix + "HD", this.HD);
        this.setParamSimple(map, prefix + "FHD", this.FHD);
        this.setParamSimple(map, prefix + "TwoK", this.TwoK);
        this.setParamSimple(map, prefix + "FourK", this.FourK);
        this.setParamSimple(map, prefix + "Online", this.Online);
        this.setParamSimple(map, prefix + "MultiSD", this.MultiSD);
        this.setParamSimple(map, prefix + "MultiHD", this.MultiHD);
        this.setParamSimple(map, prefix + "MultiFHD", this.MultiFHD);
        this.setParamSimple(map, prefix + "MultiTwoK", this.MultiTwoK);
        this.setParamSimple(map, prefix + "MultiFourK", this.MultiFourK);
        this.setParamSimple(map, prefix + "MultiOnline", this.MultiOnline);
        this.setParamSimple(map, prefix + "DeductDuration", this.DeductDuration);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

