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

public class LLMComprehendFaceRecognitionForUpdate extends AbstractModel {

    /**
    * <p>人脸识别任务开关</p><p>枚举值：</p><ul><li>ON： 开启智能人脸识别任务</li><li>OFF： 关闭智能人脸识别任务</li></ul><p>默认值：OFF</p>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * <p>人脸识别过滤分数，当识别结果达到该分数以上，返回识别结果</p><p>取值范围：[0, 100]</p>
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * <p>默认人物过滤标签，指定需要返回的默认人物的标签。如果未填或者为空，则全部默认人物结果都返回。</p><p>枚举值：</p><ul><li>entertainment： 娱乐明星</li><li>sport： 体育明星</li><li>politician： 政治人物</li></ul>
    */
    @SerializedName("DefaultLibraryLabelSet")
    @Expose
    private String [] DefaultLibraryLabelSet;

    /**
    * <p>用户自定义人物过滤标签，指定需要返回的用户自定义人物的标签。如果未填或者为空，则全部自定义人物结果都返回。 </p><p>入参限制：标签个数最多 100 个，每个标签长度最多 16 个字符。</p>
    */
    @SerializedName("UserDefineLibraryLabelSet")
    @Expose
    private String [] UserDefineLibraryLabelSet;

    /**
    * <p>人物库选择</p><p>枚举值：</p><ul><li>Default： 使用默认人物库</li><li>UserDefine： 使用用户自定义人物库</li><li>All： 同时使用默认人物库和用户自定义人物库</li></ul><p>默认值：All</p>
    */
    @SerializedName("FaceLibrary")
    @Expose
    private String FaceLibrary;

    /**
     * Get <p>人脸识别任务开关</p><p>枚举值：</p><ul><li>ON： 开启智能人脸识别任务</li><li>OFF： 关闭智能人脸识别任务</li></ul><p>默认值：OFF</p> 
     * @return Switch <p>人脸识别任务开关</p><p>枚举值：</p><ul><li>ON： 开启智能人脸识别任务</li><li>OFF： 关闭智能人脸识别任务</li></ul><p>默认值：OFF</p>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>人脸识别任务开关</p><p>枚举值：</p><ul><li>ON： 开启智能人脸识别任务</li><li>OFF： 关闭智能人脸识别任务</li></ul><p>默认值：OFF</p>
     * @param Switch <p>人脸识别任务开关</p><p>枚举值：</p><ul><li>ON： 开启智能人脸识别任务</li><li>OFF： 关闭智能人脸识别任务</li></ul><p>默认值：OFF</p>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get <p>人脸识别过滤分数，当识别结果达到该分数以上，返回识别结果</p><p>取值范围：[0, 100]</p> 
     * @return Score <p>人脸识别过滤分数，当识别结果达到该分数以上，返回识别结果</p><p>取值范围：[0, 100]</p>
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set <p>人脸识别过滤分数，当识别结果达到该分数以上，返回识别结果</p><p>取值范围：[0, 100]</p>
     * @param Score <p>人脸识别过滤分数，当识别结果达到该分数以上，返回识别结果</p><p>取值范围：[0, 100]</p>
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get <p>默认人物过滤标签，指定需要返回的默认人物的标签。如果未填或者为空，则全部默认人物结果都返回。</p><p>枚举值：</p><ul><li>entertainment： 娱乐明星</li><li>sport： 体育明星</li><li>politician： 政治人物</li></ul> 
     * @return DefaultLibraryLabelSet <p>默认人物过滤标签，指定需要返回的默认人物的标签。如果未填或者为空，则全部默认人物结果都返回。</p><p>枚举值：</p><ul><li>entertainment： 娱乐明星</li><li>sport： 体育明星</li><li>politician： 政治人物</li></ul>
     */
    public String [] getDefaultLibraryLabelSet() {
        return this.DefaultLibraryLabelSet;
    }

    /**
     * Set <p>默认人物过滤标签，指定需要返回的默认人物的标签。如果未填或者为空，则全部默认人物结果都返回。</p><p>枚举值：</p><ul><li>entertainment： 娱乐明星</li><li>sport： 体育明星</li><li>politician： 政治人物</li></ul>
     * @param DefaultLibraryLabelSet <p>默认人物过滤标签，指定需要返回的默认人物的标签。如果未填或者为空，则全部默认人物结果都返回。</p><p>枚举值：</p><ul><li>entertainment： 娱乐明星</li><li>sport： 体育明星</li><li>politician： 政治人物</li></ul>
     */
    public void setDefaultLibraryLabelSet(String [] DefaultLibraryLabelSet) {
        this.DefaultLibraryLabelSet = DefaultLibraryLabelSet;
    }

    /**
     * Get <p>用户自定义人物过滤标签，指定需要返回的用户自定义人物的标签。如果未填或者为空，则全部自定义人物结果都返回。 </p><p>入参限制：标签个数最多 100 个，每个标签长度最多 16 个字符。</p> 
     * @return UserDefineLibraryLabelSet <p>用户自定义人物过滤标签，指定需要返回的用户自定义人物的标签。如果未填或者为空，则全部自定义人物结果都返回。 </p><p>入参限制：标签个数最多 100 个，每个标签长度最多 16 个字符。</p>
     */
    public String [] getUserDefineLibraryLabelSet() {
        return this.UserDefineLibraryLabelSet;
    }

    /**
     * Set <p>用户自定义人物过滤标签，指定需要返回的用户自定义人物的标签。如果未填或者为空，则全部自定义人物结果都返回。 </p><p>入参限制：标签个数最多 100 个，每个标签长度最多 16 个字符。</p>
     * @param UserDefineLibraryLabelSet <p>用户自定义人物过滤标签，指定需要返回的用户自定义人物的标签。如果未填或者为空，则全部自定义人物结果都返回。 </p><p>入参限制：标签个数最多 100 个，每个标签长度最多 16 个字符。</p>
     */
    public void setUserDefineLibraryLabelSet(String [] UserDefineLibraryLabelSet) {
        this.UserDefineLibraryLabelSet = UserDefineLibraryLabelSet;
    }

    /**
     * Get <p>人物库选择</p><p>枚举值：</p><ul><li>Default： 使用默认人物库</li><li>UserDefine： 使用用户自定义人物库</li><li>All： 同时使用默认人物库和用户自定义人物库</li></ul><p>默认值：All</p> 
     * @return FaceLibrary <p>人物库选择</p><p>枚举值：</p><ul><li>Default： 使用默认人物库</li><li>UserDefine： 使用用户自定义人物库</li><li>All： 同时使用默认人物库和用户自定义人物库</li></ul><p>默认值：All</p>
     */
    public String getFaceLibrary() {
        return this.FaceLibrary;
    }

    /**
     * Set <p>人物库选择</p><p>枚举值：</p><ul><li>Default： 使用默认人物库</li><li>UserDefine： 使用用户自定义人物库</li><li>All： 同时使用默认人物库和用户自定义人物库</li></ul><p>默认值：All</p>
     * @param FaceLibrary <p>人物库选择</p><p>枚举值：</p><ul><li>Default： 使用默认人物库</li><li>UserDefine： 使用用户自定义人物库</li><li>All： 同时使用默认人物库和用户自定义人物库</li></ul><p>默认值：All</p>
     */
    public void setFaceLibrary(String FaceLibrary) {
        this.FaceLibrary = FaceLibrary;
    }

    public LLMComprehendFaceRecognitionForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LLMComprehendFaceRecognitionForUpdate(LLMComprehendFaceRecognitionForUpdate source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Score != null) {
            this.Score = new Float(source.Score);
        }
        if (source.DefaultLibraryLabelSet != null) {
            this.DefaultLibraryLabelSet = new String[source.DefaultLibraryLabelSet.length];
            for (int i = 0; i < source.DefaultLibraryLabelSet.length; i++) {
                this.DefaultLibraryLabelSet[i] = new String(source.DefaultLibraryLabelSet[i]);
            }
        }
        if (source.UserDefineLibraryLabelSet != null) {
            this.UserDefineLibraryLabelSet = new String[source.UserDefineLibraryLabelSet.length];
            for (int i = 0; i < source.UserDefineLibraryLabelSet.length; i++) {
                this.UserDefineLibraryLabelSet[i] = new String(source.UserDefineLibraryLabelSet[i]);
            }
        }
        if (source.FaceLibrary != null) {
            this.FaceLibrary = new String(source.FaceLibrary);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamArraySimple(map, prefix + "DefaultLibraryLabelSet.", this.DefaultLibraryLabelSet);
        this.setParamArraySimple(map, prefix + "UserDefineLibraryLabelSet.", this.UserDefineLibraryLabelSet);
        this.setParamSimple(map, prefix + "FaceLibrary", this.FaceLibrary);

    }
}

