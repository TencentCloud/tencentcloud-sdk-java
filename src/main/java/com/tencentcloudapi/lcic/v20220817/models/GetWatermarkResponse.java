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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetWatermarkResponse extends AbstractModel {

    /**
    * 老师视频区域的水印参数配置
    */
    @SerializedName("TeacherLogo")
    @Expose
    private WatermarkConfig TeacherLogo;

    /**
    * 白板区域的水印参数配置
    */
    @SerializedName("BoardLogo")
    @Expose
    private WatermarkConfig BoardLogo;

    /**
    * 背景图片配置
    */
    @SerializedName("BackgroundPicture")
    @Expose
    private BackgroundPictureConfig BackgroundPicture;

    /**
    * 文字水印配置
    */
    @SerializedName("Text")
    @Expose
    private TextMarkConfig Text;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 老师视频区域的水印参数配置 
     * @return TeacherLogo 老师视频区域的水印参数配置
     */
    public WatermarkConfig getTeacherLogo() {
        return this.TeacherLogo;
    }

    /**
     * Set 老师视频区域的水印参数配置
     * @param TeacherLogo 老师视频区域的水印参数配置
     */
    public void setTeacherLogo(WatermarkConfig TeacherLogo) {
        this.TeacherLogo = TeacherLogo;
    }

    /**
     * Get 白板区域的水印参数配置 
     * @return BoardLogo 白板区域的水印参数配置
     */
    public WatermarkConfig getBoardLogo() {
        return this.BoardLogo;
    }

    /**
     * Set 白板区域的水印参数配置
     * @param BoardLogo 白板区域的水印参数配置
     */
    public void setBoardLogo(WatermarkConfig BoardLogo) {
        this.BoardLogo = BoardLogo;
    }

    /**
     * Get 背景图片配置 
     * @return BackgroundPicture 背景图片配置
     */
    public BackgroundPictureConfig getBackgroundPicture() {
        return this.BackgroundPicture;
    }

    /**
     * Set 背景图片配置
     * @param BackgroundPicture 背景图片配置
     */
    public void setBackgroundPicture(BackgroundPictureConfig BackgroundPicture) {
        this.BackgroundPicture = BackgroundPicture;
    }

    /**
     * Get 文字水印配置 
     * @return Text 文字水印配置
     */
    public TextMarkConfig getText() {
        return this.Text;
    }

    /**
     * Set 文字水印配置
     * @param Text 文字水印配置
     */
    public void setText(TextMarkConfig Text) {
        this.Text = Text;
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

    public GetWatermarkResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetWatermarkResponse(GetWatermarkResponse source) {
        if (source.TeacherLogo != null) {
            this.TeacherLogo = new WatermarkConfig(source.TeacherLogo);
        }
        if (source.BoardLogo != null) {
            this.BoardLogo = new WatermarkConfig(source.BoardLogo);
        }
        if (source.BackgroundPicture != null) {
            this.BackgroundPicture = new BackgroundPictureConfig(source.BackgroundPicture);
        }
        if (source.Text != null) {
            this.Text = new TextMarkConfig(source.Text);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TeacherLogo.", this.TeacherLogo);
        this.setParamObj(map, prefix + "BoardLogo.", this.BoardLogo);
        this.setParamObj(map, prefix + "BackgroundPicture.", this.BackgroundPicture);
        this.setParamObj(map, prefix + "Text.", this.Text);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

