package com.anpilov.picturepo.common;

import org.junit.Test;
import org.opencv.core.Core;

import java.io.File;
import java.net.URL;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class OpenCVLoaderTest {

	@Test
	public void testLoad() {
		OpenCVLoader.load();
		assertNotNull(Core.getBuildInformation());
	}

	@Test
	public void testLibResourceExists() {
		URL url = OpenCVLoader.getLibResource();
		assertTrue(new File(url.getFile()).exists());
	}

}
