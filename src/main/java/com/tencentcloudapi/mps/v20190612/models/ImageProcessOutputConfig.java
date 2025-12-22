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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageProcessOutputConfig extends AbstractModel {

    /**
    * 输出图片的宽高比。可以配合ImageWidth 和 ImageHeight 使用，规则如下：

1. 仅指定 AspectRatio 时，根据原图输入进行自适应调整。
2. 指定 AspectRatio 和 ImageWidth 时，ImageHeight  由两者计算得出，反亦是如此。
3. 当AspectRatio、ImageWidth、ImageHeight 同时指定的时候，优先使用ImageWidth、ImageHeight。

可取值：1:1、3:2、2:3、3:4、4:3、4:5、5:4、9:16、16:9、21:9

支持该参数 ScheduleId: 30010(扩图)
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * 图片输出高度，单位：像素。
    */
    @SerializedName("ImageHeight")
    @Expose
    private Long ImageHeight;

    /**
    * 图片输出宽度，单位：像素。
    */
    @SerializedName("ImageWidth")
    @Expose
    private Long ImageWidth;

    /**
     * Get 输出图片的宽高比。可以配合ImageWidth 和 ImageHeight 使用，规则如下：

1. 仅指定 AspectRatio 时，根据原图输入进行自适应调整。
2. 指定 AspectRatio 和 ImageWidth 时，ImageHeight  由两者计算得出，反亦是如此。
3. 当AspectRatio、ImageWidth、ImageHeight 同时指定的时候，优先使用ImageWidth、ImageHeight。

可取值：1:1、3:2、2:3、3:4、4:3、4:5、5:4、9:16、16:9、21:9

支持该参数 ScheduleId: 30010(扩图) 
     * @return AspectRatio 输出图片的宽高比。可以配合ImageWidth 和 ImageHeight 使用，规则如下：

1. 仅指定 AspectRatio 时，根据原图输入进行自适应调整。
2. 指定 AspectRatio 和 ImageWidth 时，ImageHeight  由两者计算得出，反亦是如此。
3. 当AspectRatio、ImageWidth、ImageHeight 同时指定的时候，优先使用ImageWidth、ImageHeight。

可取值：1:1、3:2、2:3、3:4、4:3、4:5、5:4、9:16、16:9、21:9

支持该参数 ScheduleId: 30010(扩图)
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set 输出图片的宽高比。可以配合ImageWidth 和 ImageHeight 使用，规则如下：

1. 仅指定 AspectRatio 时，根据原图输入进行自适应调整。
2. 指定 AspectRatio 和 ImageWidth 时，ImageHeight  由两者计算得出，反亦是如此。
3. 当AspectRatio、ImageWidth、ImageHeight 同时指定的时候，优先使用ImageWidth、ImageHeight。

可取值：1:1、3:2、2:3、3:4、4:3、4:5、5:4、9:16、16:9、21:9

支持该参数 ScheduleId: 30010(扩图)
     * @param AspectRatio 输出图片的宽高比。可以配合ImageWidth 和 ImageHeight 使用，规则如下：

1. 仅指定 AspectRatio 时，根据原图输入进行自适应调整。
2. 指定 AspectRatio 和 ImageWidth 时，ImageHeight  由两者计算得出，反亦是如此。
3. 当AspectRatio、ImageWidth、ImageHeight 同时指定的时候，优先使用ImageWidth、ImageHeight。

可取值：1:1、3:2、2:3、3:4、4:3、4:5、5:4、9:16、16:9、21:9

支持该参数 ScheduleId: 30010(扩图)
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get 图片输出高度，单位：像素。 
     * @return ImageHeight 图片输出高度，单位：像素。
     */
    public Long getImageHeight() {
        return this.ImageHeight;
    }

    /**
     * Set 图片输出高度，单位：像素。
     * @param ImageHeight 图片输出高度，单位：像素。
     */
    public void setImageHeight(Long ImageHeight) {
        this.ImageHeight = ImageHeight;
    }

    /**
     * Get 图片输出宽度，单位：像素。 
     * @return ImageWidth 图片输出宽度，单位：像素。
     */
    public Long getImageWidth() {
        return this.ImageWidth;
    }

    /**
     * Set 图片输出宽度，单位：像素。
     * @param ImageWidth 图片输出宽度，单位：像素。
     */
    public void setImageWidth(Long ImageWidth) {
        this.ImageWidth = ImageWidth;
    }

    public ImageProcessOutputConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageProcessOutputConfig(ImageProcessOutputConfig source) {
        if (source.AspectRatio != null) {
            this.AspectRatio = new String(source.AspectRatio);
        }
        if (source.ImageHeight != null) {
            this.ImageHeight = new Long(source.ImageHeight);
        }
        if (source.ImageWidth != null) {
            this.ImageWidth = new Long(source.ImageWidth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AspectRatio", this.AspectRatio);
        this.setParamSimple(map, prefix + "ImageHeight", this.ImageHeight);
        this.setParamSimple(map, prefix + "ImageWidth", this.ImageWidth);

    }
}

