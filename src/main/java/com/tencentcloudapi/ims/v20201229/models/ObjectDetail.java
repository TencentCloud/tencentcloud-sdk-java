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
package com.tencentcloudapi.ims.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ObjectDetail extends AbstractModel{

    /**
    * 该参数用于返回识别对象的ID以方便识别和区分。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 该参数用于返回命中的实体标签。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 该参数用于返回对应实体标签所对应的值或内容。如：当标签为*二维码(QrCode)*时，该字段为识别出的二维码对应的URL地址。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 该参数用于返回对应实体标签命中的分值，取值为**0-100**，如：*QrCode 99* 则代表相应识别内容命中二维码场景标签的概率非常高。
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 该字段用于返回实体检测框的坐标位置（左上角xy坐标、长宽、旋转角度）以方便快速定位实体的相关信息。
    */
    @SerializedName("Location")
    @Expose
    private Location Location;

    /**
    * 该参数用于返回命中的实体二级标签。
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
     * Get 该参数用于返回识别对象的ID以方便识别和区分。 
     * @return Id 该参数用于返回识别对象的ID以方便识别和区分。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 该参数用于返回识别对象的ID以方便识别和区分。
     * @param Id 该参数用于返回识别对象的ID以方便识别和区分。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 该参数用于返回命中的实体标签。 
     * @return Name 该参数用于返回命中的实体标签。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 该参数用于返回命中的实体标签。
     * @param Name 该参数用于返回命中的实体标签。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 该参数用于返回对应实体标签所对应的值或内容。如：当标签为*二维码(QrCode)*时，该字段为识别出的二维码对应的URL地址。 
     * @return Value 该参数用于返回对应实体标签所对应的值或内容。如：当标签为*二维码(QrCode)*时，该字段为识别出的二维码对应的URL地址。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 该参数用于返回对应实体标签所对应的值或内容。如：当标签为*二维码(QrCode)*时，该字段为识别出的二维码对应的URL地址。
     * @param Value 该参数用于返回对应实体标签所对应的值或内容。如：当标签为*二维码(QrCode)*时，该字段为识别出的二维码对应的URL地址。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 该参数用于返回对应实体标签命中的分值，取值为**0-100**，如：*QrCode 99* 则代表相应识别内容命中二维码场景标签的概率非常高。 
     * @return Score 该参数用于返回对应实体标签命中的分值，取值为**0-100**，如：*QrCode 99* 则代表相应识别内容命中二维码场景标签的概率非常高。
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 该参数用于返回对应实体标签命中的分值，取值为**0-100**，如：*QrCode 99* 则代表相应识别内容命中二维码场景标签的概率非常高。
     * @param Score 该参数用于返回对应实体标签命中的分值，取值为**0-100**，如：*QrCode 99* 则代表相应识别内容命中二维码场景标签的概率非常高。
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 该字段用于返回实体检测框的坐标位置（左上角xy坐标、长宽、旋转角度）以方便快速定位实体的相关信息。 
     * @return Location 该字段用于返回实体检测框的坐标位置（左上角xy坐标、长宽、旋转角度）以方便快速定位实体的相关信息。
     */
    public Location getLocation() {
        return this.Location;
    }

    /**
     * Set 该字段用于返回实体检测框的坐标位置（左上角xy坐标、长宽、旋转角度）以方便快速定位实体的相关信息。
     * @param Location 该字段用于返回实体检测框的坐标位置（左上角xy坐标、长宽、旋转角度）以方便快速定位实体的相关信息。
     */
    public void setLocation(Location Location) {
        this.Location = Location;
    }

    /**
     * Get 该参数用于返回命中的实体二级标签。 
     * @return SubLabel 该参数用于返回命中的实体二级标签。
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set 该参数用于返回命中的实体二级标签。
     * @param SubLabel 该参数用于返回命中的实体二级标签。
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    public ObjectDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ObjectDetail(ObjectDetail source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.Location != null) {
            this.Location = new Location(source.Location);
        }
        if (source.SubLabel != null) {
            this.SubLabel = new String(source.SubLabel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamObj(map, prefix + "Location.", this.Location);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);

    }
}

