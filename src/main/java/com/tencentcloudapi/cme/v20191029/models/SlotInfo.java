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

public class SlotInfo extends AbstractModel{

    /**
    * 卡槽 Id。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 素材类型，同素材素材，可取值有：
<li> AUDIO :音频;</li>
<li> VIDEO :视频;</li>
<li> IMAGE :图片。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 默认素材 Id。
    */
    @SerializedName("DefaultMaterialId")
    @Expose
    private String DefaultMaterialId;

    /**
    * 素材时长，单位秒。
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
     * Get 卡槽 Id。 
     * @return Id 卡槽 Id。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 卡槽 Id。
     * @param Id 卡槽 Id。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 素材类型，同素材素材，可取值有：
<li> AUDIO :音频;</li>
<li> VIDEO :视频;</li>
<li> IMAGE :图片。</li> 
     * @return Type 素材类型，同素材素材，可取值有：
<li> AUDIO :音频;</li>
<li> VIDEO :视频;</li>
<li> IMAGE :图片。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 素材类型，同素材素材，可取值有：
<li> AUDIO :音频;</li>
<li> VIDEO :视频;</li>
<li> IMAGE :图片。</li>
     * @param Type 素材类型，同素材素材，可取值有：
<li> AUDIO :音频;</li>
<li> VIDEO :视频;</li>
<li> IMAGE :图片。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 默认素材 Id。 
     * @return DefaultMaterialId 默认素材 Id。
     */
    public String getDefaultMaterialId() {
        return this.DefaultMaterialId;
    }

    /**
     * Set 默认素材 Id。
     * @param DefaultMaterialId 默认素材 Id。
     */
    public void setDefaultMaterialId(String DefaultMaterialId) {
        this.DefaultMaterialId = DefaultMaterialId;
    }

    /**
     * Get 素材时长，单位秒。 
     * @return Duration 素材时长，单位秒。
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set 素材时长，单位秒。
     * @param Duration 素材时长，单位秒。
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    public SlotInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlotInfo(SlotInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.DefaultMaterialId != null) {
            this.DefaultMaterialId = new String(source.DefaultMaterialId);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "DefaultMaterialId", this.DefaultMaterialId);
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

