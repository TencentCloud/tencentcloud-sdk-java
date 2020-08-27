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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitcherPgmOutputConfig extends AbstractModel{

    /**
    * 导播台输出模板 ID，可取值：
<li>10001：分辨率为1080 P；</li>
<li>10002：分辨率为720 P；</li>
<li>10003：分辨率为480 P。</li>
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 导播台输出宽。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 导播台输出高。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 导播台输出帧率。
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * 导播台输出码率。
    */
    @SerializedName("BitRate")
    @Expose
    private Long BitRate;

    /**
     * Get 导播台输出模板 ID，可取值：
<li>10001：分辨率为1080 P；</li>
<li>10002：分辨率为720 P；</li>
<li>10003：分辨率为480 P。</li> 
     * @return TemplateId 导播台输出模板 ID，可取值：
<li>10001：分辨率为1080 P；</li>
<li>10002：分辨率为720 P；</li>
<li>10003：分辨率为480 P。</li>
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 导播台输出模板 ID，可取值：
<li>10001：分辨率为1080 P；</li>
<li>10002：分辨率为720 P；</li>
<li>10003：分辨率为480 P。</li>
     * @param TemplateId 导播台输出模板 ID，可取值：
<li>10001：分辨率为1080 P；</li>
<li>10002：分辨率为720 P；</li>
<li>10003：分辨率为480 P。</li>
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 导播台输出宽。 
     * @return Width 导播台输出宽。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 导播台输出宽。
     * @param Width 导播台输出宽。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 导播台输出高。 
     * @return Height 导播台输出高。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 导播台输出高。
     * @param Height 导播台输出高。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 导播台输出帧率。 
     * @return Fps 导播台输出帧率。
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set 导播台输出帧率。
     * @param Fps 导播台输出帧率。
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get 导播台输出码率。 
     * @return BitRate 导播台输出码率。
     */
    public Long getBitRate() {
        return this.BitRate;
    }

    /**
     * Set 导播台输出码率。
     * @param BitRate 导播台输出码率。
     */
    public void setBitRate(Long BitRate) {
        this.BitRate = BitRate;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "BitRate", this.BitRate);

    }
}

