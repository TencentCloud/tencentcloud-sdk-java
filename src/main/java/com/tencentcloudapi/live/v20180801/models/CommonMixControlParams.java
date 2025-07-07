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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonMixControlParams extends AbstractModel {

    /**
    * 取值范围[0,1]。
填1时，当参数中图层分辨率参数与视频实际分辨率不一致时，自动从视频中按图层设置的分辨率比例进行裁剪。
    */
    @SerializedName("UseMixCropCenter")
    @Expose
    private Long UseMixCropCenter;

    /**
    * 取值范围[0,1]
填1时，当InputStreamList中个数为1时，且OutputParams.OutputStreamType为1时，不执行取消操作，执行拷贝流操作
    */
    @SerializedName("AllowCopy")
    @Expose
    private Long AllowCopy;

    /**
    * 取值范围[0,1]
填1时，透传原始流的sei
    */
    @SerializedName("PassInputSei")
    @Expose
    private Long PassInputSei;

    /**
    * 取值范围[0,1]
填1时，图片输入中的透明通道生效。
    */
    @SerializedName("UsePictureTransparent")
    @Expose
    private Long UsePictureTransparent;

    /**
     * Get 取值范围[0,1]。
填1时，当参数中图层分辨率参数与视频实际分辨率不一致时，自动从视频中按图层设置的分辨率比例进行裁剪。 
     * @return UseMixCropCenter 取值范围[0,1]。
填1时，当参数中图层分辨率参数与视频实际分辨率不一致时，自动从视频中按图层设置的分辨率比例进行裁剪。
     */
    public Long getUseMixCropCenter() {
        return this.UseMixCropCenter;
    }

    /**
     * Set 取值范围[0,1]。
填1时，当参数中图层分辨率参数与视频实际分辨率不一致时，自动从视频中按图层设置的分辨率比例进行裁剪。
     * @param UseMixCropCenter 取值范围[0,1]。
填1时，当参数中图层分辨率参数与视频实际分辨率不一致时，自动从视频中按图层设置的分辨率比例进行裁剪。
     */
    public void setUseMixCropCenter(Long UseMixCropCenter) {
        this.UseMixCropCenter = UseMixCropCenter;
    }

    /**
     * Get 取值范围[0,1]
填1时，当InputStreamList中个数为1时，且OutputParams.OutputStreamType为1时，不执行取消操作，执行拷贝流操作 
     * @return AllowCopy 取值范围[0,1]
填1时，当InputStreamList中个数为1时，且OutputParams.OutputStreamType为1时，不执行取消操作，执行拷贝流操作
     */
    public Long getAllowCopy() {
        return this.AllowCopy;
    }

    /**
     * Set 取值范围[0,1]
填1时，当InputStreamList中个数为1时，且OutputParams.OutputStreamType为1时，不执行取消操作，执行拷贝流操作
     * @param AllowCopy 取值范围[0,1]
填1时，当InputStreamList中个数为1时，且OutputParams.OutputStreamType为1时，不执行取消操作，执行拷贝流操作
     */
    public void setAllowCopy(Long AllowCopy) {
        this.AllowCopy = AllowCopy;
    }

    /**
     * Get 取值范围[0,1]
填1时，透传原始流的sei 
     * @return PassInputSei 取值范围[0,1]
填1时，透传原始流的sei
     */
    public Long getPassInputSei() {
        return this.PassInputSei;
    }

    /**
     * Set 取值范围[0,1]
填1时，透传原始流的sei
     * @param PassInputSei 取值范围[0,1]
填1时，透传原始流的sei
     */
    public void setPassInputSei(Long PassInputSei) {
        this.PassInputSei = PassInputSei;
    }

    /**
     * Get 取值范围[0,1]
填1时，图片输入中的透明通道生效。 
     * @return UsePictureTransparent 取值范围[0,1]
填1时，图片输入中的透明通道生效。
     */
    public Long getUsePictureTransparent() {
        return this.UsePictureTransparent;
    }

    /**
     * Set 取值范围[0,1]
填1时，图片输入中的透明通道生效。
     * @param UsePictureTransparent 取值范围[0,1]
填1时，图片输入中的透明通道生效。
     */
    public void setUsePictureTransparent(Long UsePictureTransparent) {
        this.UsePictureTransparent = UsePictureTransparent;
    }

    public CommonMixControlParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommonMixControlParams(CommonMixControlParams source) {
        if (source.UseMixCropCenter != null) {
            this.UseMixCropCenter = new Long(source.UseMixCropCenter);
        }
        if (source.AllowCopy != null) {
            this.AllowCopy = new Long(source.AllowCopy);
        }
        if (source.PassInputSei != null) {
            this.PassInputSei = new Long(source.PassInputSei);
        }
        if (source.UsePictureTransparent != null) {
            this.UsePictureTransparent = new Long(source.UsePictureTransparent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UseMixCropCenter", this.UseMixCropCenter);
        this.setParamSimple(map, prefix + "AllowCopy", this.AllowCopy);
        this.setParamSimple(map, prefix + "PassInputSei", this.PassInputSei);
        this.setParamSimple(map, prefix + "UsePictureTransparent", this.UsePictureTransparent);

    }
}

